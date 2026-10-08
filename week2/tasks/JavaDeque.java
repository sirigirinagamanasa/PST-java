import java.util.*;

public class JavaDeque {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // Add at the end
        deque.addLast(10);
        deque.addLast(20);

        // Add at the beginning
        deque.addFirst(5);

        System.out.println("Deque: " + deque);

        // See first and last
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        // Remove first
        deque.removeFirst();

        // Remove last
        deque.removeLast();

        System.out.println("After removals: " + deque);
    }
}
