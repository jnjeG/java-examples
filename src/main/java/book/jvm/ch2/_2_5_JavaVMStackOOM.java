package book.jvm.ch2;

/**
 * VM Args：-Xss2M （这时候不妨设大些）
 * @author zzm
 */
public class _2_5_JavaVMStackOOM {

    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable {
        _2_5_JavaVMStackOOM oom = new _2_5_JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}

