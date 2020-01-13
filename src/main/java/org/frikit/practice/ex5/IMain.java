package org.frikit.practice.ex5;

public interface IMain {

    void method();

    void method2();

    //doesn't compile should have keyword default
//    void method3() {
//        System.out.println("1");
//    }

    default void method4() {
        System.out.println(1);
    }
}
