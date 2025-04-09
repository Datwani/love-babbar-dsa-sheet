import java.util.Arrays;

public class Q5_negative_elements_to_one_side {
    public static void main(String[] args) {
        int []arr={-12,11,-13,-5,6,-7,5,-3,-6};
        sort(arr);
    }
    static void sort(int [] arr)
    {
        int i=0;
        int j= arr.length-1;
       while (i<=j)
       {
           if (arr[i]>0)
           {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;

           }
           else {
               i++;
           }
           if (arr[j]<0) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
           else {j--;}

       }
        System.out.println(Arrays.toString(arr));
    }
}
