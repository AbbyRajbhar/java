package exception;

import java.util.Scanner;

public class trys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] marks={79,96,94};

        try {
             System.out.println("your marks is " + marks[4]);
        } catch (Exception exception) {
            // TODO: handle exception

            System.out.println(78);
        }

       
    }
    
}
