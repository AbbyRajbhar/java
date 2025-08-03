package lec10.homework;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int[] numbers = {45, 3, 89, 15, -9, 102, 38};  

        int max = numbers[0];  
        int min = numbers[0];  

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];  
            }
            if (numbers[i] < min) {
                min = numbers[i];  
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }

}
}
