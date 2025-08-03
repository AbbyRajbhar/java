package lec15;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n!=0) {
            n = n&(n -1);
            count++;
            
        }

        System.out.println("Number of 1 in binary representation:" + count);
    }
    
}
