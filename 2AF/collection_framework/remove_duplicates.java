import java.util.*;

public class remove_duplicates
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int x : list){
            if(!ans.contains(x)){   // contains used here
                ans.add(x);
            }
        }

        System.out.println("After removing duplicates: " + ans);
    }
}
