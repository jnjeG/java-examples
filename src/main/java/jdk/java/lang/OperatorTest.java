package jdk.java.lang;

/**
 * Created by chenjunjie on 16/3/29.
 */
public class OperatorTest {
    public static void main(String[] args) {
//        yihuoTest();
//        posisionOperatorTest();
//        yuTest();
//        operatorSeq();
//        powerTest();
        operatorSeq2();
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

    public static void yuTest(){
        int te = 7;
        boolean eZero = (te & 1) == 0;
        System.out.println(eZero);
    }

    public static void operatorSeq(){
        int i = 0 ;
        boolean b = (i++ == 1);
        System.out.println(b);
        System.out.println(i);
    }

    public static void operatorSeq2(){
        int i =4;
        int n =0;
        n -= (i >>> 1);
//        n -= i >>> 1; //the same with above
        System.out.println(n);
    }



    public static void powerTest(){
        int i = 4;
        int ii = i & (i -1);
        System.out.print(ii);
    }
}

