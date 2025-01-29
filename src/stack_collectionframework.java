import java.util.Scanner;
import java.util.Stack;

public class stack_collectionframework {
    public static void main(String[] args) {
        Stack<Integer> c = new Stack<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            System.out.println("Enter data:  ");
            int data = sc.nextInt();
            c.push(data);
        }
        c.push(10);
        c.push(20);
        c.push(30);
        c.push(40);
        c.push(50);
        c.push(60);
//        _______________peek
//        int d = c.peek();
//        System.out.println(d);
//        ________________pop
//        c.pop();
//        if (!c.empty()){
//            c.pop();
//        }
//        System.out.println(c);
//        _________________search
//        c.search(10);
//        System.out.println(c);

    }
}
