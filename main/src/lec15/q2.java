package lec15;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        System.out.println("Enter the position to toggle 0 based");
        int pos = sc.nextInt();

        int mask = 1<< pos ;
        int result = n ^ mask;
         
        System.out.println("number after toggling bit at postion " + pos + ": 4" +result);

    }
    
}
