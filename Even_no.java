import java.util.Scanner;

public class Even_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enteer value of n");
        int n = sc.nextInt();
        int temp = 0;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                temp = temp + 1;
            }
        }
            if (temp > 0) {
                System.out.println("not prime no");
            } else {
                System.out.println("Prime no");
            }
        }
    }



