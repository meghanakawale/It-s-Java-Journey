import java.util.Scanner;

public class nsum_fum {
    public static int sum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter value of n");
        int n= sc.nextInt();
        int total=sum(n);
        System.out.println("addition upto n "+total);
    }
}
