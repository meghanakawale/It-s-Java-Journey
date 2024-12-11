import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double length;
        double width;
        Scanner sc = new Scanner(System.in);
        length=sc.nextDouble();
        width=sc.nextDouble();
        double Area= length*width;

        System.out.println("Area="+Area);

        double Perimeter= 2*(length+width);
        System.out.println("Perimeter="+Perimeter);
    }
}
