package ARRAY_1D;

public class first_and_last_occurence {

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9, 3, 2};
        int target = 3;
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) first = i;
                last = i;
            }
        }
        System.out.println("First occurrence of " + target + " is at index: " + first);
        System.out.println("Last occurrence of " + target + " is at index: " + last);
    }
}

