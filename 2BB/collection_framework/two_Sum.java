import java.util.*;
public class two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];

            if (map.containsKey(x)) {
                return new int[]{i, map.get(x)};
            }

            map.put(nums[i], i);
        }

        return new int[]{}; // no solution
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // size of array
        
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] ans = twoSum(nums, target);

        if (ans.length == 0) {
            System.out.println("No pair found");
        } else {
            System.out.println(ans[0] + " " + ans[1]);
        }

  
    }
}
