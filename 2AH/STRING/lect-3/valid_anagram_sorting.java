import java.util.*;

public class valid_anagram_sorting {
    public static void main(String[] args) {
        System.out.println(isAnagramSorting("applet","paple"));
    }

    public static boolean isAnagramSorting(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }

}
