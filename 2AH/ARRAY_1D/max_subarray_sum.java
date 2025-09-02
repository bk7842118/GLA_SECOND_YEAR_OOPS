package ARRAY_1D;

public class max_subarray_sum {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        
        for (int i = 0; i < n; i++) {
            
            for (int j = i; j < n; j++) {
                int currentSum = 0;
                
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}


