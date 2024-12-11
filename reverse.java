import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size :");
        int arr_size = 0;
        arr_size = scanner.nextInt();


        int arr[] = new int[arr_size];
        System.out.println("Enter the array element :");
        for (int i = 0; i < arr_size; i++)
        {
            arr[i] = scanner.nextInt();
        }

            System.out.println("The original Array are =");
            {
                for (int i = 0; i < arr_size; i++) {
                    System.out.println(arr[i] + " ");
                }
            }
        System.out.println("The reverse array :");
        {
            for (int i=arr.length-1;i>=0;i--)
            {
                System.out.println(arr[i]+" ");
            }
        }


        }
    }
