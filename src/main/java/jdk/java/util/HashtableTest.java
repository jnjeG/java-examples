package jdk.java.util;


import java.util.Hashtable;

/**
 * Created by chenjunjie on 16/3/29.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Object,Object> ht = new Hashtable<Object, Object>();
        ht.put("ss","dd");
        ht.put(ht,ht);
        System.out.print(ht);
    }
}
