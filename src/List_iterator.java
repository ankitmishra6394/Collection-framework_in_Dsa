import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_iterator {
    public static void main(String[] args) {
        List<Integer> c =new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(20);
        c.add(1000);
        ListIterator<Integer> d = c.listIterator();
        while (d.hasNext()){
            System.out.println(d.next());
        }while (d.hasPrevious()){
            System.out.println(d.previous());
        }
    }
}
