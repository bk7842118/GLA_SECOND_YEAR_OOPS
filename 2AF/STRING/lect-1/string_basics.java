
import java.util.*;
public class string_basics {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = "gla";              // String Literal
        String s2 = new String("gla");  // String Object
        String s = "abc";
        s.concat("def");    // Returns new string "abcdef", original 's' remains "abc"
        System.out.println(s1.length()); // Output: 3
        System.out.println(s1.charAt(0)); // Output: 'g'
        System.out.println(s1.substring(1, 3)); // Output: "la"
        String newStr = s1.concat("university"); // "glauniversity"
        System.out.println(s1.equals(s2)); // Output: true
        System.out.println(s1.compareTo(s2)); // Output: 0 (if both have "Java")
        String str = sc.nextLine();//user input
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        // Output: g l a
    }
}

