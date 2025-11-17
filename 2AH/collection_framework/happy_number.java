import java.util.*;

public class happy_number{

    public static int sumSq(int n){
        int sum = 0;
        while(n > 0){
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        while(n != 1){
            n = sumSq(n);

            if(set.contains(n)){
                System.out.println("Not a Happy Number");
                return;
            }
            set.add(n);
        }

        System.out.println("Happy Number");
    }
}
