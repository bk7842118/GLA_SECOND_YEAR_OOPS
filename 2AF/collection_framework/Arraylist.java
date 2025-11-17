import java.util.*;

public class Arraylist{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // 1. add() - add elements
        list.add(10);
        list.add(20);
        list.add(30);

        // 2. add(index, element)
        list.add(1, 15);  // 10, 15, 20, 30

        // 3. get(index)
        System.out.println("Element at index 2: " + list.get(2));

        // 4. set(index, element)
        list.set(2, 200); // update value at index 2

        // 5. remove(index)
        list.remove(0);  // removes 10

        // 6. remove(Object) → remove first occurrence of value
        list.remove(Integer.valueOf(30));  // removes value 30

        // 7. contains(value)
        System.out.println("Contains 15? " + list.contains(15));

        // 8. size()
        System.out.println("Size: " + list.size());

        // 9. isEmpty()
        System.out.println("Is empty? " + list.isEmpty());

        // 10. for loop
        System.out.println("\n--- Using for loop ---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 11. for-each loop
        System.out.println("\n--- Using for-each loop ---");
        for (int x : list) {
            System.out.println(x);
        }

        // 12. clear()
        list.clear();
        System.out.println("\nAfter clear(): " + list);
    }
}
