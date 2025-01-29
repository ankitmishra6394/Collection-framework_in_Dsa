import java.util.LinkedList;

public class linked_list_collection_framework {
    public static void main(String[] args) {
        LinkedList<Integer> c = new LinkedList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        c.add(60);
//        ______________________________remove
//        c.remove(2);
//        ________________________________get
//        int d = c.get(4);
//        System.out.println(d);
//        -------------------------------clear
//        c.clear();
//        System.out.println(c);
//        _______________________________set
//        c.set(1,90);
//        System.out.println(c);
//        ______________________________contains
//        boolean f = c.contains(200);
//        boolean f1 = c.contains(300);
//        System.out.println(f);
//        System.out.println(f1);
//        printing the data in the form of the array not the arraylist

        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
    }
}
