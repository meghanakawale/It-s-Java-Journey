import java.util.Scanner;

public class avg_fun {
    public static int avg(int a,int b,int c) {
        int total = (a + b + c) / 3;
        return total;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no 1");
        int a= sc.nextInt();
        System.out.println(" enter no 2");
        int b=sc.nextInt();
        System.out.println("Enter no 3");
        int c=sc.nextInt();

        int avg=avg(a,b,c);
        System.out.println("average="+avg);
    }

}

