import java.util.*;

public class first_unique_character_two_loop {
    public static void main(String[] args) {
        System.out.println(firstUniqCharTwoLoops("aabbcddeec"));
    }
    public static int firstUniqCharTwoLoops(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            boolean unique = true;
            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) return i;
        }
        return -1;
    }

}
