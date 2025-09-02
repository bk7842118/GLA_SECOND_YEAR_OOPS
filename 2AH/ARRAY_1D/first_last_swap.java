package ARRAY_1D;

public class first_last_swap {
  public static void main(String[] args) {
        int arr[]={10,8,19,90};
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        // print
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
  }  
}
