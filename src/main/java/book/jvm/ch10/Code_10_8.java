package book.jvm.ch10;

/**
 * Created by chenjunjie on 16/6/12.
 */
public class Code_10_8 {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
    }

}

/**
 反编译后的代码
 package book.jvm.ch10;

 import java.io.PrintStream;

 public class Code_10_8
 {

 public Code_10_8()
 {
 }

 public static void main(String args[])
 {
 Integer a = Integer.valueOf(1);
 Integer b = Integer.valueOf(2);
 Integer c = Integer.valueOf(3);
 Integer d = Integer.valueOf(3);
 Integer e = Integer.valueOf(321);
 Integer f = Integer.valueOf(321);
 Long g = Long.valueOf(3L);
 System.out.println(c == d);
 System.out.println(e == f);
 System.out.println(c.intValue() == a.intValue() + b.intValue());  //有+运算符就拆箱，拆箱后就变成数值比较
 System.out.println(c.equals(Integer.valueOf(a.intValue() + b.intValue())));
 System.out.println(g.longValue() == (long)(a.intValue() + b.intValue()));  //有+运算符就拆箱，拆箱后就变成数值比较，向大的数据类型转型后比较
 System.out.println(g.equals(Integer.valueOf(a.intValue() + b.intValue())));//遇到equals()不转型
 }
 }


 */
