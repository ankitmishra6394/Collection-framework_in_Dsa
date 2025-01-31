import java.util.TreeMap;
import java.util.Map;

public class Tree_Map {
    public static void main(String[] args) {
        Map<Integer, String> c = new TreeMap<>();
        c.put(10,"A");
        c.put(11,"B");
        c.put(12,"C");
        c.put(13,"D");
        c.put(14,"E");
        System.out.println("The value of the TreeMap is: "+c); // -----------> Printing the value of the treemap.

        c.putIfAbsent(10,"F");
        System.out.println(c); // ----------> They check the given value is present or not in the treemap, if the value is present in the map they print the privious value.

        System.out.println(c.isEmpty()); // ---------> They checks the hash map contain any value or not.

        c.remove(10);
        System.out.println(c); // ----------> They removed the value of 10 in the treemap.

        for (int i : c.keySet()){
            System.out.println(i); // --------> They print the key value of the TreeMap.
        } for (String j : c.values()){
            System.out.println(j); // ---------> They print the values of the TreeMap.
        }

    }
}
