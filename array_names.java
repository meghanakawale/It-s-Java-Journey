import java.util.Scanner;

public class array_names {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        String name[]=new String[size];

        //input
        for (int i=0;i<size;i++){
            name[i]=sc.next();
        }

        //output
        for (int i=0;i<name.length;i++){
            System.out.println("name is :"+name[i]);
        }
    }
}
