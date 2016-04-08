package jdk.sun.misc;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;

import static sun.misc.Unsafe.getUnsafe;

/**
 *  referrence document : http://ifeve.com/sun-misc-unsafe/
 */
public class UnsafeTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
//        allocateInstance();
//        objectFiledOffsetTest();
//        copyMemoryTest();
//        sizeOfObjectTest();
    }

    private static void sizeOfObjectTest() {
        long l = sizeOf(new Guard());
        System.out.print(l);
    }

    private static void copyMemoryTest() {
        String password = new String("l00k@myHor$e");
        String fake = new String(password.replaceAll(".", "?"));
        System.out.println(password); // l00k@myHor$e
        System.out.println(fake); // ????????????

        getUnsafeMethod().copyMemory(
                fake, 0L, null, toAddress(password), sizeOf(password));

        System.out.println(password); // ????????????
        System.out.println(fake); // ????????????
    }


    private static void objectFiledOffsetTest() throws NoSuchFieldException, IllegalAccessException {
        Guard guard = new Guard();
        guard.giveAccess();   // false, no access

// bypass
        Unsafe unsafe = getUnsafeMethod();
        Field f = guard.getClass().getDeclaredField("ACCESS_ALLOWED");
        unsafe.putInt(guard, unsafe.objectFieldOffset(f), 42); // memory corruption

        guard.giveAccess(); // true, access granted
    }


    private static void allocateInstance() throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Unsafe unsafe = getUnsafeMethod();

        A o1 = new A(); // constructor
        o1.a(); // prints 1

        A o2 = A.class.newInstance(); // reflection
        o2.a(); // prints 1

        A o3 = (A) unsafe.allocateInstance(A.class); // unsafe
        o3.a(); // prints 0
    }

    private static Unsafe getUnsafeMethod() {
        try {
            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            return (Unsafe) f.get(null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


    static Object shallowCopy(Object obj) {
        long size = sizeOf(obj);
        long start = toAddress(obj);
        long address = getUnsafeMethod().allocateMemory(size);
        getUnsafeMethod().copyMemory(start, address, size);
        return fromAddress(address);
    }

    static long toAddress(Object obj) {
        Object[] array = new Object[] {obj};
        long baseOffset = getUnsafeMethod().arrayBaseOffset(Object[].class);
        return normalize(getUnsafeMethod().getInt(array, baseOffset));
    }

    static Object fromAddress(long address) {
        Object[] array = new Object[] {null};
        long baseOffset = getUnsafeMethod().arrayBaseOffset(Object[].class);
        getUnsafeMethod().putLong(array, baseOffset, address);
        return array[0];
    }

    /**
     * normalize是一个为了正确内存地址使用，将有符号的int类型强制转换成无符号的long类型的方法
     * int类型强制转换成无符号的long类型的方法
     * @param value
     * @return
     */
    private static long normalize(int value) {
        if(value >= 0) return value;
        return (~0L >>> 32) & value; //0000 0000 0000 0000->0000 0000 1111 1111
    }

    /*public static long sizeOf(Object object){
        return getUnsafe().getAddress(
                normalize(getUnsafe().getInt(object, 4L)) + 12L);
    }*/

    public static long sizeOf(Object o) {
        Unsafe u = getUnsafeMethod();
        HashSet<Field> fields = new HashSet<Field>();
        Class c = o.getClass();
        while (c != Object.class) {
            for (Field f : c.getDeclaredFields()) {
                if ((f.getModifiers() & Modifier.STATIC) == 0) {
                    fields.add(f);
                }
            }
            c = c.getSuperclass();
        }

        // get offset
        long maxSize = 0;
        for (Field f : fields) {
            long offset = u.objectFieldOffset(f);
            if (offset > maxSize) {
                maxSize = offset;
            }
        }

        return ((maxSize/8) + 1) * 8;   // padding
    }
}

class A {
    private long a; // not initialized value

    public A() {
        this.a = 1; // initialization
    }

    public long a() {
        System.out.println(this.a);
        return this.a;
    }
}


class Guard {
    private int ACCESS_ALLOWED = 1;
    private int ACCESS_ALLOWED2 = 1;

    public boolean giveAccess() {
        boolean b = 42 == ACCESS_ALLOWED;
        System.out.println(b);
        return b;
    }
}