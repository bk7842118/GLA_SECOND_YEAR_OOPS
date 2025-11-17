import java.util.*;

public class set {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // 1. add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // duplicate ignore

        // 2. contains()
        System.out.println("Contains 20? " + set.contains(20));

        // 3. remove(value)
        set.remove(10);

        // 4. size()
        System.out.println("Size: " + set.size());

        // 5. isEmpty()
        System.out.println("Is empty? " + set.isEmpty());

        // 6. iterate using for-each
        System.out.println("\n--- Using for-each loop ---");
        for (int x : set) {
            System.out.println(x);
        }

        // 7. clear()
        set.clear();
        System.out.println("\nAfter clear(): " + set);
    }
}
