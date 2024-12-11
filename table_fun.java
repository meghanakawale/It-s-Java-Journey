import java.util.Scanner;

public class table_fun {
    public static int table(int no){
        for (int i=1;i<=10;i++){
            int table=i*no;
            System.out.println(table);
        }
        return no;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int no =sc.nextInt();
        table(no);

    }
}
