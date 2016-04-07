package jdk.java.util;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chenjunjie on 16/4/7.
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        boolean aa = s.add("aa");
        boolean aa1 = s.add("aa");
        System.out.println(aa);
        System.out.println(aa1);
    }
}
