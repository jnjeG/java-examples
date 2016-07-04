package jdk.java.util;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdaterTest{

    public static void main(String[] args) {
        AtomicFieldIncr atomicFieldIncr = new AtomicFieldIncr();
        AtomicIntegerFieldUpdater<AtomicFieldIncr> atomicFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(AtomicFieldIncr.class , "idx");

        atomicFieldUpdater.set(atomicFieldIncr, 3);
        System.out.println(atomicFieldIncr.getIdx());

        atomicFieldUpdater.compareAndSet(atomicFieldIncr, 3, 4);
        System.out.println(atomicFieldIncr.getIdx());
    }
}