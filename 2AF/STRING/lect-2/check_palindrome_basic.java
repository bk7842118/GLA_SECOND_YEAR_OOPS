import java.util.*;

public class check_palindrome_basic {
    public static void main(String[] args) {
        String input = "nitin";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed: " + reversed); // Output: "olleh"
        if(input.equals(reversed)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }

    }
}
