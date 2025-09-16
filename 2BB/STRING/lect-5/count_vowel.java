import java.util.*;

public class count_vowel {
  
    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String test = "glauniversity";
        System.out.println("Number of vowels (a,e,i,o,u): " + countVowels(test)); 
    }

}
