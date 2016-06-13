package book.jvm.ch11;

/**
 VMOptions:
 -XX:+PrintCompilation -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly

 add Environment Variable :
 LD_LIBRARY_PATH=/Users/chenjunjie/Downloads/
 (comment:LD_LIBRARY_PATH variable means the parent directory of hsdis-amd64.dylib file )

 Reference link:
 http://nitschinger.at/Printing-JVM-generated-Assembler-on-Mac-OS-X/
 http://yueyemaitian.iteye.com/blog/2042772
 */
public class Code_11_2 {
    public static final int NUM = 15000;

    public static int doubleValue(int i) {
        // 这个空循环用于后面演示JIT代码优化过程
        for(int j=0; j<100000; j++);
        return i * 2;
    }

    public static long calcSum() {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += doubleValue(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 0; i < NUM; i++) {
            calcSum();
        }
    }

}
