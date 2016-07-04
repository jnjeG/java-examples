package jdk.java.util;

import sun.reflect.Reflection;

public class AtomicFieldIncr extends AtomicIntegerFieldUpdaterTest //解开注释后,idx是protected类型的,可以正常调用.
// Q：不是应该AtomicFieldIncr是AtomicIntegerFieldUpdaterTest的父类才可以访问AtomicFieldIncr的protected属性吗?
{

    //这里最好是public volatile，不要加final、static
    //修饰符最好也不要为protected，private，涉及调用者访问被调用者的access问题
//    public volatile int idx;
//    private volatile int idx;
    protected volatile int idx;
//    volatile int idx;

    public AtomicFieldIncr(){
    }

    public int getIdx(){
        //0,-1返回Reflection本身
        System.out.println(Reflection.getCallerClass(0));
        System.out.println(Reflection.getCallerClass(-1));
        //1返回自己
        System.out.println(Reflection.getCallerClass(1));
        //2，空返回调用者
        System.out.println(Reflection.getCallerClass(2));
        System.out.println(Reflection.getCallerClass());
        return this.idx;
    }

    public void setIdx(int idx){
        this.idx = idx;
    }
}