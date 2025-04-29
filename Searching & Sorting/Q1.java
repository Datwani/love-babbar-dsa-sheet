//Find first and last positions of an element in a sorted array

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 7, 67, 123, 125};
        int target = 4;
        int[] result = findFirstAndLastPosition(arr, target);
        if (result[0] == -1) {
            System.out.println("-1");
        } else {
            System.out.println(result[0] + " " + result[1]);
        }
    }

    static int[] findFirstAndLastPosition(int[] arr, int target) {
        int[] result = {-1, -1};

        // If array is empty
        if (arr == null || arr.length == 0) {
            return result;
        }

        // Find first position using binary search
        result[0] = findPosition(arr, target, true);
        if (result[0] == -1) {
            return result;
        }

        // Find last position using binary search
        result[1] = findPosition(arr, target, false);

        return result;
    }

    static int findPosition(int[] arr, int target, boolean firstOccurrence) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (firstOccurrence) {
                    right = mid - 1;  // Continue searching in left half for first occurrence
                } else {
                    left = mid + 1;   // Continue searching in right half for last occurrence
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}

