import java.util.Scanner;

public class minmax_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int array[]=new int[size];
        //input

        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();

        }
        //display array
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]);
        }
        int min=array[0];
        int max=array[0];

        for (int i=0;i<size;i++){
            if (array[i]<min){
                min=array[i];
            }
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);

    }
}
