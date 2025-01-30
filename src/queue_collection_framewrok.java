import java.util.LinkedList;
import java.util.Queue;

public class queue_collection_framewrok {
    public static void main(String[] args) {
        Queue<Integer> c = new LinkedList<>();
        c.offer(10);
        c.offer(20);
        c.offer(30);
        c.offer(40);
        c.offer(50);
        c.offer(60);
        c.offer(100);
//        Checking the front element in the queue
        System.out.println(c.peek());
    }
}
