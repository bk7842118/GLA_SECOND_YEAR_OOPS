package ARRAY_1D;

public class two_sum_unsorted_array {
    public static void main(String[] args) {
        int arr[]={-5,18,5,13,50};
        int target=18;
        for (int i = 0; i < arr.length; i++) {
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[i] + arr[j] == target) {
                   System.out.println("(" + arr[i] + ", " + arr[j] + ")");
               }
           }
        }

    }
}
