import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer :");
       int n = sc.nextInt();



        for (int i = 1; i<=n; i++)
        {
            fact *=i;
        }


            System.out.println("Factorial of number=" + fact);


    }
}
