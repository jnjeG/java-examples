package book.jvm.ch2;

/**
 * VM Args：-Xss128k
 * @author zzm
 */
public class _2_4_JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        _2_4_JavaVMStackSOF oom = new _2_4_JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}

