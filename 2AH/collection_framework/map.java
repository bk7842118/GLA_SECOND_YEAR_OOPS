import java.util.*;

public class map {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. put(key, value)
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);

        // duplicate key -> value replace hoga
        map.put(2, 250);

        // 2. get(key)
        System.out.println("Value at key 2: " + map.get(2));

        // 3. containsKey(key)
        System.out.println("Contains key 3? " + map.containsKey(3));

        // 4. containsValue(value)
        System.out.println("Contains value 300? " + map.containsValue(300));

        // 5. remove(key)
        map.remove(1);

        // 6. size()
        System.out.println("Size: " + map.size());

        // 7. isEmpty()
        System.out.println("Is empty? " + map.isEmpty());

        // 8. Iteration - keySet()
        System.out.println("\n--- Using keySet ---");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // 9. Iteration - entrySet()
        System.out.println("\n--- Using entrySet ---");
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // 10. values()
        System.out.println("\nAll Values: " + map.values());

        // 11. clear()
        map.clear();
        System.out.println("\nAfter clear(): " + map);
    }
}
