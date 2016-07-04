package jdk.sun.misc.reflect.reflectTest;

public class D {

    public static void print() {
        System.out.println(sun.reflect.Reflection.getCallerClass());
        //class jdk.sun.misc.reflect.reflectTest.C
        System.out.println(sun.reflect.Reflection.getCallerClass(0));
        //class sun.reflect.Reflection
        System.out.println(sun.reflect.Reflection.getCallerClass(1));
        //class D //jdk.sun.misc.reflect.reflectTest.D
        System.out.println(sun.reflect.Reflection.getCallerClass(2));
        //class C //jdk.sun.misc.reflect.reflectTest.C
        System.out.println(sun.reflect.Reflection.getCallerClass(3));
        //class B //jdk.sun.misc.reflect.reflectTest.B
        System.out.println(sun.reflect.Reflection.getCallerClass(4));
        //class A //jdk.sun.misc.reflect.reflectTest.A
        System.out.println(sun.reflect.Reflection.getCallerClass(5));
        //class Test  //jdk.sun.misc.reflect.reflectTest.Test
    }

}