import java.util.*;

public class armstrong_number {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=n;
    int len=0;
    while(x!=0){
        len++;
        x=x/10;
    }
    int sum=0;
    x=n;
     while(x!=0){
        int d=x%10;
        sum=sum+(int)Math.pow(d,len);
        x=x/10;
    }
    if(sum==n){
    System.out.println("yes");  
    }else{
        System.out.println("no"); 
    }
    }
}
