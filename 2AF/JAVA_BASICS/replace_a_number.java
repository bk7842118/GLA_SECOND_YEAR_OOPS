import java.util.Scanner;

public class replace_a_number {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rep=0;
    int pos=1;
    while(n!=0){
        int d=n%10;
        if(d==9)d=5;
        rep=rep+d*pos;
        pos=pos*10;
        n=n/10;
    }
    System.out.println(rep);
    }
}
