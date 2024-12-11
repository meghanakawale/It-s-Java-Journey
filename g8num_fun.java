import java.util.Scanner;

public class g8num_fun {
    public static void great(int num1,int num2){
        if(num1>num2){
            System.out.println("greater num="+num1);
        }
        else {
            System.out.println("greater num="+num2);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num 2");
        int num2=sc.nextInt();

        great(num1,num2);




    }
}
