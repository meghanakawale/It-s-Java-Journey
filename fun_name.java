import java.util.Scanner;

public class fun_name {
    public static void myname(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String name=sc.next();
        System.out.println("my name is ="+name);
    }
}
