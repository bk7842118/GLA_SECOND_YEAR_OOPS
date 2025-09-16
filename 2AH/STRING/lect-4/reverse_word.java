import java.util.*;

public class reverse_word {
    public static void main(String[] args) {
        String s="i love gla";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
       String st[]= s.trim().split(" ");
       String ans="";
       for(int i=st.length-1;i>=0;i--){
        if(st[i].length()!=0)ans+=st[i]+" ";
       }
     
       return ans.trim();
    }
}
