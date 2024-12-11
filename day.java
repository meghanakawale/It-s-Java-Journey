import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter month number");
        int month=sc.nextInt();

        switch (month){
            case 1:
                if(month == 1){
                    System.out.println("january");
                }
                break;
            case 2:
                if (month == 2){
                    System.out.println("feb");
                }
                break;

            case 3:
                if (month==3){
                    System.out.println("march");
                }
                break;

            case 4:
                if (month==4){
                    System.out.println("april");
                }
                break;

            case 5:
                if (month==5){
                    System.out.println("May");
                }
                break;
            case 6:
                if (month==6){
                    System.out.println("june");
                }
                break;

            case 7:
                if (month==7){
                    System.out.println("july");
                }
                break;


            case 8:
                if (month==8){
                    System.out.println("Aug");
                }
                break;

            case 9:
                if (month==9){
                    System.out.println("sept");
                }
                break;

            case 10:
                if (month==10){
                    System.out.println("oct");
                }
                break;

            case 11:
                if (month==11){
                    System.out.println("nov");
                }
                break;

            case 12:
                if (month==12){
                    System.out.println("dec");
                }
                break;

            default:
                System.out.println("Invalid number");
        }
    }
}
