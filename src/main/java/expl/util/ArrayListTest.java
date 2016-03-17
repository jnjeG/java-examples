package expl.util;

import org.junit.Assert;

import java.util.ArrayList;

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
}
