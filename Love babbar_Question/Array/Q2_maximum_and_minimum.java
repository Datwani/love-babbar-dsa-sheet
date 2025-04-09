public class Q2_maximum_and_minimum {
    public static void main(String[] args) {
        int []arr={3,5,4,1,9};
        int max=arr[0];
        int min=arr[0];

        for (int i=0;i< arr.length;i++)
        {
            if (max<arr[i])
            {
                max=arr[i];
            }
            if (min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println(max+" "+min);
    }
}
