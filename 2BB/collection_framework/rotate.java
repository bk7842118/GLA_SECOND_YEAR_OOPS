import java.util.*;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        int k = sc.nextInt();  // steps to rotate
        k = k % n;

        // Rotate by k times - ONLY LOOP
        for(int r = 0; r < k; r++){
            int last = list.get(list.size() - 1);

            // shift right
            for(int i = list.size() - 1; i > 0; i--){
                list.set(i, list.get(i - 1));
            }

            list.set(0, last);
        }

        System.out.println("Rotated: " + list);
    }
}
