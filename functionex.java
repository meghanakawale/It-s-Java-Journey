import java.util.Scanner;

public class functionex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println("Enter the integer :"+n);
        System.out.println("The sum of integer :"+sumDigits(n));
    }

    static int sumDigits(long n) {


        int sum = 0;

          while (n!=0)
          {
              sum = (int) (sum +n % 10);
              n= n/10;
          }
          return sum;

    }
}
