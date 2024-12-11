import java.util.Scanner;

public class fun_mul {
    public static int mul(int a,int b){
        int multiplication=a*b;
        return (multiplication);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num 1");
        int a=sc.nextInt();
        System.out.println("Enter num 2");
        int b=sc.nextInt();
        int product=mul(a,b);
        System.out.println(product);

    }
}
