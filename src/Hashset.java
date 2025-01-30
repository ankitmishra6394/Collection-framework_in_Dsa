import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        c.add(10);
        c.add(10);
        c.add(20);
        c.add(30);
        System.out.println(c); // ------> adding the from the hashset.

        c.remove(30);
        System.out.println(c); // -------> delete the item from the hashset

        c.clear();
        System.out.println(c); // ---------> clear the hashset
    }
}
