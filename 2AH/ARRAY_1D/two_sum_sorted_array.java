package ARRAY_1D;

public class two_sum_sorted_array {
    public static void main(String[] args) {
        // two pinter approach
        int arr[]={5,10,25,30,35,40,100};
        int target=70;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("(" + arr[left] + ", " + arr[right] + ")");
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

    }
}
