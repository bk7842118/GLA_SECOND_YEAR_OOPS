package ARRAY_1D;

public class k_rotate_array {
     public static void main(String[] args) {
        int arr[]={10,7,18,50,80};
        int k = 2;
        rotate(arr,k);
        // print
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }
    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    public static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    
}
