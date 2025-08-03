package lec15;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n > 0 && (n & (n - 1)) == 0){
            System.out.println("is a power of 2");

        }else{
            System.out.println("is NOT a power of 2");
        }

    }
    
}
