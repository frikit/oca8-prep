package org.frikit.practice.ex1;

public class Ex1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        if (sb.equals(s)) {
            System.out.println("1");
        } else if (sb.toString().equals(s)) {
            //is 2 because 5 in the constructor of string builder is capacity not value and mean is empty == empty
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}
