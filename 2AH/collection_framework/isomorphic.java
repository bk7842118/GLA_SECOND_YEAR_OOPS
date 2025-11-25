import java.util.*;
public class isomorphic {

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);

            if (map.containsKey(x)) {
                if (map.get(x) != y) return false;
            } 
            else if (map.containsValue(y)) {
                return false;
            }

            map.put(x, y);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        boolean ans = isIsomorphic(s, t);

        System.out.println(ans);

    }
}
