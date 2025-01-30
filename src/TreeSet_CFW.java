import java.util.Set;
import java.util.TreeSet;

public class TreeSet_CFW {
    public static void main(String[] args) {
        Set<Integer> c = new TreeSet<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(10);
        System.out.println(c); // -------> printing the values.

        c.remove(20);
        System.out.println(c); //----------> deleting the value 20.

        int d = c.size();
        System.out.println(d); //----------> calculating the size of the TreeSet.

        System.out.println(c.contains(100)); // ---------> Checking the given value is present or not in the TreeSet.

        c.clear();
        System.out.println(c); // ----------> clear the all TreeSet.
    }
}
