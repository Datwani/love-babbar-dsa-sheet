import java.util.Arrays;

public class Q4_Sort_0s_1s_and_2s {
    static void arrsort(int arr[])
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j< arr.length;j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []arr={0,1,2,0,1,2};
        arrsort(arr);
    }

}
