import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue_collection_framework {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder()); // -----> max heap
        q.offer(10);
        q.offer(200);
        q.offer(300);
        q.offer(4000);
        q.offer(560);
//        System.out.println(q); -------> printing the data

//        q.poll();
//        q.poll();
//        q.poll();
//        System.out.println(q); -------> deleting the data form the priority queue
    }
}
