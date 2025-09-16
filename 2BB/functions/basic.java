import java.util.*;

public class basic {
    public static void main(String[] args) {
       System.out.println("welcome");
       System.out.println(f1(10,20));
       System.out.println("END"); 
    }  
    public static int f1(int a,int b){
        int c=100;
        System.out.println("i m in f1");
        System.out.println(f2());
        return c+f2();
    }
     public static int f2(){
        int c=10;
        System.out.println(c);
        System.out.println("i m in f2");
        return c+10;
    }    
}
