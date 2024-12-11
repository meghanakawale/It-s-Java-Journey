import java.util.Scanner;

public class fun_sum {
    public static int addition(int a, int b){
        int sum =a+b;
        return (sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no 1 =");
        int a=sc.nextInt();
        System.out.println("Enter no 2 =");
        int b= sc.nextInt();
        int sum= addition(a,b);
        System.out.println(sum);
    }
}
