
import java.util.*;

public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        // Initialize
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // SINGLE LOOP
        for(int x : list){

            // MAX
            if(x > max){
                max = x;
            }
            
            // MIN
            if(x < min){
                min = x;
            }
        }

        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);

    }
}
