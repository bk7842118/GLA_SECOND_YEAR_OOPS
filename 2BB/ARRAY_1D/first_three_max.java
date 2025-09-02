 package ARRAY_1D;
import java.util.*;
public class first_three_max {
    public static void main(String[] args) {
        // array element are distinct
        int arr[]={10,-5,15,17};
        int n=arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i=0;i<n;i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third ) {
                third = arr[i];
            }
        }
    System.out.println("First: " + first);
    System.out.println("Second: " + second);
    System.out.println("Third: " + third);
  }
}
