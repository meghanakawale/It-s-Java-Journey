public class Min_Max {
    public static void main(String[] args) {
        int a[]={2,3,5,4,7,8,99};
                int max=a[0];
                int min=a[0];
                for(int i=1;i<a.length;i++)
                {
                    if(a[i]>max)
                    {
                        max=a[i];
                    }
                }
        System.out.println("Maximum ele is : "+max);

                for (int i=1;i<a.length;i++)
                {
                    if (a[i]>min);
                    {
                        min=a[i];
                    }
                }
        System.out.println("minimum element is : "+min);

    }
}
