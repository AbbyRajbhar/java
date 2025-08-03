package lec10.arrayproblemquestion;
import java.util.Arrays;

public class q1 {
    //second largest elements in an arra

    static int getsecondLargest(int [] arr){
        int n = arr.length;

        Arrays.sort(arr);
        
        for (int i =n-2 ; i >= 0; i--) {
            if (arr[i] != arr[n-1]) {
                return arr[i];
                
            }
            
        }

        return-1;
    }

    public static void main(String[] args) {
        int [] arr ={12, 23, 314, 45, 5};
        System.out.println(getsecondLargest(arr));
    }
    
}
