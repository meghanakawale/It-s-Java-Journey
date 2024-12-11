public class reversestring {
    public static void main(String[] args) {
        String str="Meghana";
        String rev="";

        System.out.println("The original string ="+str);

        for(int i=str.length()-1;i>=0;i--) {
            rev += str.charAt(i);
        }
            System.out.println("reverse string =" + rev);
        }
    }
