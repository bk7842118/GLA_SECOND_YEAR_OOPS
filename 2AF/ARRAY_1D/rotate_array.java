package ARRAY_1D;

public class rotate_array {
    public static void main(String[] args) {
            int arr[]={10,7,18,50,80};
      
            int last = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j+1] = arr[j];
            }
            arr[0] = last;
            // print
            for(int x=0;x<arr.length;x++){
                System.out.print(arr[x]+" ");
            }
    }
}
