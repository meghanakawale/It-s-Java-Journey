import java.util.Scanner;

public class prime_fun{
    public static int prime(int no) {
        int temp = 0;

        // Loop to check divisors
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                temp = temp + 1; // Increment temp if a divisor is found
            }
        }

        // Check the value of temp after the loop
        if (temp > 0) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }

        return temp; // Return temp for debugging or further use
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int no = sc.nextInt();

        // Call the prime function
        int a = prime(no);
        System.out.println(a);


    }
}
