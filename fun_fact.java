import java.util.Scanner;

public class fun_fact {
    public static int fact_no(int a) {
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;

        }
        return (factorial);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a= sc.nextInt();
        int fac=fact_no(a);
        System.out.println(" fact of no ="+fac);
    }
    }
