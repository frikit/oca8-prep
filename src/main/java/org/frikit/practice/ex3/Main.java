package org.frikit.practice.ex3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //046 is the octal format but is valid
        //08 is invalid because it cannot fit in int
        int[] a = {1, 2, 3, 046, 5, 6};
        System.out.println(Arrays.toString(a));
    }
}
