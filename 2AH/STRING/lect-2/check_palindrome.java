import java.util.*;

public class check_palindrome {
    public static void main(String[] args) {
        String s = "nitish";
        boolean isPalindrome = true;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(s + (isPalindrome ? " is a palindrome." : " is not a palindrome."));

    }
}
