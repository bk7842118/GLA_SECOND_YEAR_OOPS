import java.util.*;

public class contains_duplicate
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        // Add all elements to set
        for(int x : arr){
            set.add(x);  // duplicates automatically ignored
        }

        // Check duplicate using sizes
        if(set.size() != arr.length){
            System.out.println("Contains Duplicate");
        } else {
            System.out.println("No Duplicate");
        }
    }
}
