import java.util.Scanner;

public class even_fun {
    public static int even(int no) {
        if (no % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
        return no;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int no=sc.nextInt();
        int a=even(no);
    }
}
