package lec10.homework;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int Matrix [][] = new int [n] [m];

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                Matrix [i] [j]= sc.nextInt();
                
            }

        }

        System.out.println("The spiral order Matrix is: ");

        int rowStart = 0;
        int rowEnd = n-1;

        int colStart = 0;
        int colEnd =m-1;

        while (rowStart <=rowEnd && colStart<=colEnd) {

            // 1
            for (int col = colStart; col <colStart; col++) {
                System.out.println(Matrix[rowStart] [col]+ " ");
                
            }
            rowStart ++;

            // 2

            for (int row = rowStart; row <rowEnd; row++) {
                System.out.println(Matrix[row] [colEnd]+ " ");
                
            }

            //3

               for(int col=colEnd; col>=colStart; col--) {
              System.out.print(Matrix[rowEnd][col]+ " ");
          }
          rowEnd--;

            //4

           for(int row=rowEnd; row>=rowStart; row--) {

              System.out.print( Matrix[row][colStart]+ " ");
          }
          colStart++;

          System.out.println();

            
            
        }

    }
    
}
