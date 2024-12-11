
import java.util.Scanner;
class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter value of A ");
        double a= sc.nextDouble();
        System.out.println("Enter value of B ");
        double b= sc.nextDouble();

        System.out.println("choose an operation");
        System.out.println("1: Addition");
        System.out.println("2:Subtraction");
        System.out.println("3:Multiplication");
        System.out.println("4:Division");
        System.out.println("5:Modulus");
        int operation=sc.nextInt();

        double result=0;

        switch (operation){
            case 1:
                result=a+b;
                break;

            case 2:
                result = a-b;
                break;

            case 3:
                result =a*b;
                break;

            case 4:
                result =a/b;
                break;

            case 5:
                result=a%b;
                break;

            default:
                System.out.println("Invalid choice");

        }

        System.out.println("The result is "+result);


    }


}


