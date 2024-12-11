import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n= sc.nextInt();
        int res=1;

        for (int i=1;i<=10;i++){

            res=i*n;
            System.out.println(res);

        }
        

    }
}
