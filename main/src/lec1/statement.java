import java.util.Scanner;

public class statement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your button: ");
        int button= sc.nextInt();


//       if(button == 1){
//           System.out.println("hello");
//
//       }else if(button == 2){
//            System.out.println("Namaste");
//        }else if (button == 3){
//           System.out.println("bonjour");
//       }else{
//           System.out.println("invalid");
//       }
//        sc.close();

        switch (button){
            case 1 : System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3 : System.out.println("bonjour");
            break;
            default: System.out.println("invalid");

        }

    }
}
