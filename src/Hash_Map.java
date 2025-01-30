import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        Map<Integer, String> c = new HashMap<>();
        c.put(10,"Ankit");
        c.put(11,"Aman");
        c.put(12,"Aditya");
        c.put(13,"Alok");
        System.out.println(c); // ------> storing the value in hashmap the form of the key and value.

        c.putIfAbsent(10,"DCCn");
        System.out.println(c); // ------> checking the given key is present or not in this hashmap, if the key is present in the hashmap they print the presented value.

        System.out.println(c.isEmpty()); // ----------> They checks the hash map contain any value or not.

        c.remove(10);
        System.out.println(c); // ---------> It removes the key value of the 10.

        for (int d:c.keySet()){
            System.out.println(d); // ------> They prints the all the keys.
        } for (String f:c.values()){
            System.out.println(f); // -------> They print the all the values.
        }
    }
}
