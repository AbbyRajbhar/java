package miniproject;

import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int MyNumber = (int )(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Guess my number(1-100):");
             userNumber = sc.nextInt();

            
            if (userNumber == MyNumber) {
                System.out.println("WOOHOO.... you win");

                break;
            }else if(userNumber > MyNumber){
                System.out.println("Your number is too large");


            }else{
                System.out.println("your number is too small");
            }
        }while(userNumber >= 0);

        System.out.println("my number was:");
        System.out.println(MyNumber);

    }
    
}
