package expl.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/3/17.
 */
public class ArraysTest {

    public static void main(String[] args) {
//        copyOfTest();
        copyOfTestV2();
    }

    public static void copyOfTest(){
        List<Object> l = new ArrayList<Object>(Arrays.asList("foo", "bar"));
        String[] strings = Arrays.copyOf(l.toArray(), l.size(), String[].class);
        for (String string : strings) {
            System.out.println(string);
        }
        /*Object[] strings = Arrays.copyOf(l.toArray(), l.size(), Object[].class);
        for (Object string : strings) {
            System.out.println(string);
        }*/
    }

    public static void copyOfTestV2(){
        // initializing unsorted short array
        Short shortArr[] = new Short[]{5, 2, 15, 52, 10};

        // copy the array into another Number array
        Number[] arr2 = Arrays.copyOf(shortArr, 5, Number[].class);
        // let us print all the elements available in list
        System.out.println("The copied number array is:");
        for (Number number : arr2) {
            System.out.println("Number = " + number);
        }

        //uncomment the code below
       /* Object[] arr2 = Arrays.copyOf(shortArr, 5, Object[].class);
        System.out.println("The copied number array is:");
        for (Object number : arr2) {
            System.out.println("Number = " + number);
        }*/
    }


}
