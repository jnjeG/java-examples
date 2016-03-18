package expl.java.util;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chenjunjie on 16/3/17.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        addAllTest();
    }

    public static void addAllTest(){
        ArrayList<String> addList = new ArrayList<String>();
        ArrayList<String> l = new ArrayList<String>();
        boolean addSuccess = l.addAll(addList);
        Assert.assertEquals(true,addSuccess);
    }


    public static void setTest(){
        List<Object> l = new ArrayList<Object>(Arrays.asList("foo", "bar"));
        l.set(0, new Object());
    }

    public static void cloneTest(){
        ArrayList<Object> l = new ArrayList<Object>(Arrays.asList("foo", "bar"));
        ArrayList<Object> clone =(ArrayList<Object>) l.clone();
        System.out.println(clone.size());
    }

    public static void getTest(){
        List<Object> l = new ArrayList<Object>(Arrays.asList("foo", "bar"));
        Object o = l.get(-1);
    }
}
