package ARRAY_1D;

public class k_rotate_array_two_loop {
    public static void main(String[] args) {
        int arr[]={10,7,18,50,80};
        int k = 2;
        for (int i = 0; i < k; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j+1] = arr[j];
            }
            arr[0] = last;
        }
        // print
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }
}
