import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int no;
        int temp=0;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the integer");
        no= sc.nextInt();

        for(int i=2;i<=no-1;i++)
        {
            temp=temp++;
        }
        if(temp>0)
        {
            System.out.println("is not a prime number");
        }
        else
        {
            System.out.println("Is a prime number");
        }

    }
}
