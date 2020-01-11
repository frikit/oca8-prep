package org.frikit.practice.ex4;

public class Main {

    public static void bool(boolean bool1, boolean... booleans) {
        System.out.println(booleans.length);
    }

    public static void main(String[] args) {
        bool(true, true, true);
//        bool(true, {true, true}); // doesn't compile
    }
}
