import java.util.Deque;
import java.util.LinkedList;

public class Offer59 {

    private Deque<Integer> queue;
    private Deque<Integer> maxQueue;

    public Offer59() {
        queue = new LinkedList<>();
        maxQueue = new LinkedList<>();
    }

    public int max_value() {
        if (maxQueue.isEmpty()) {
            return -1;
        }
        return maxQueue.peekFirst();
    }

    public void push_back(int value) {
        int n = 0;
        while (!maxQueue.isEmpty() && maxQueue.peekLast() < value) {
            maxQueue.pollLast();
            n++;
        }
        for (int i = 0; i < n; i++) {
            maxQueue.offerLast(value);
        }
        maxQueue.offerLast(value);
        queue.offerLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        maxQueue.pollFirst();
        return queue.pollFirst();
    }

    public static void main(String[] args) {
        Offer59 queue = new Offer59();
        queue.push_back(1);
        queue.push_back(2);
        queue.push_back(3);
        queue.push_back(1);
        queue.push_back(6);
        queue.push_back(2);
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());
    }

}
