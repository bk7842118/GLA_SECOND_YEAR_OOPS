package ARRAY_1D;

public class reverse_an_array {
    public static void main(String[] args) {
        int arr[]={10,100,30,60};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
         // print
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }
}
