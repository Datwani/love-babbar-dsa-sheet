import java.util.Arrays;

public class Q1_Array_Reverse {
    public static void main(String[] args) {
        int [] arr={1,4,3,2,6,5};
        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
            int remain=arr[start];
            arr[start]=arr[end];
            arr[end]=remain;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
