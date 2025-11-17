import java.util.*;

public class iterator {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> it = list.iterator();

        System.out.println("Using Iterator:");

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
