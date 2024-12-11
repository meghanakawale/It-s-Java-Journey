import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int t;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number=");
        t = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(t + "*" + i + "=" + t * i);
        }
    }
}
