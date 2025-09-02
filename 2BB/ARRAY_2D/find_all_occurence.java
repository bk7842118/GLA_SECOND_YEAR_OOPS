package ARRAY_2D;
import java.util.Scanner;
public class find_all_occurence {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == target) {
                    System.out.println("(" + i + ", " + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println(-1);
        }

    }
}


