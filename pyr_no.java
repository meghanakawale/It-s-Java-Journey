import java.util.Scanner;

public class pyr_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");

        int n=sc.nextInt();

        for (int i=0;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
