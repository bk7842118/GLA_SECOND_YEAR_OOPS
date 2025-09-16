import java.util.*;

public class count_all_char {

    public static void countAllCharacters(String s) {
        int[] freq = new int[26]; 

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println("'" + (char) (i+'a')+ "' : " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        String test = "helloworld";
        countAllCharacters(test);
    }
}


