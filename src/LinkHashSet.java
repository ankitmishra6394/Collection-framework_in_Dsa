
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSet {
    public static void main(String[] args) {
        Set<Integer> c = new LinkedHashSet<>();
        c.add(10);
        c.add(10);
        c.add(20);
        c.add(30);
        System.out.println(c); // ------> adding the from the hashset.

        c.remove(30);
        System.out.println(c); // -------> delete the item from the hashset

//        c.clear();
//        System.out.println(c); // ---------> clear the hashset

        int d = c.size();
        System.out.println(d); // ----------> checking the size of the hashset

        System.out.println(c.contains(900)); // ------------> checking the given value is present or not.

    }
}
