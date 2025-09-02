package ARRAY_1D;

public class max_subarray_sum_two_loop {
   
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

       
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
          
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}


