package lec13;

import java.util.Scanner;

public class builderform {

    // Reverse a string (Using stringbuilder class)

    public static void main(String[] args) {
        String original = "hello abhay";

        StringBuilder sb = new StringBuilder(original);
        sb.reverse();

        String reverse = sb.toString();

        System.out.println("Original String:" + original);
        System.out.println("Reversd String: " + reverse);


    }
    
}
