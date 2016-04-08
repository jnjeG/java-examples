package jdk.java.lang;

/**
 * Created by chenjunjie on 16/3/29.
 */
public class OperatorTest {
    public static void main(String[] args) {
//        yihuoTest();
        posisionOperatorTest();
    }

    private static void yihuoTest() {
        int length = 4;
        boolean b = (length & 1) == 0;
        System.out.print(b);
    }


    public static void posisionOperatorTest(){
        int i = 1 << 30;
        System.out.print(i);
    }
}
