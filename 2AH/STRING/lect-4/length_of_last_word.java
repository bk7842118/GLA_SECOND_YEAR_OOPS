import java.util.*;

public class length_of_last_word {
    public static void main(String[] args) {
        String s="hello worldtt";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
       
        String[] arr = s.trim().split(" ");
     
        return arr[arr.length - 1].length();
    }
}
