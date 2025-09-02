package JAVA_BASICS;
import java.util.Scanner;
public class prime_number_between_x_and_y {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        for (int i = x; i <= y; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return false;
            }
            return true;
    }
}

