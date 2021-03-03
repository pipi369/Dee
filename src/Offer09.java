import java.util.Stack;

public class Offer09 {

    private Stack<Integer> stack0;
    private Stack<Integer> stack1;

    public Offer09() {
        stack0 = new Stack<>();
        stack1 = new Stack<>();
    }

    public void appendTail(int value) {
        stack0.push(value);
    }

    public int deleteHead() {
        if (stack1.isEmpty()) {
            while (!stack0.isEmpty()) {
                stack1.push(stack0.pop());
            }
        }
        if (stack1.isEmpty()) {
            return -1;
        }
        return stack1.pop();
    }

    public static void main(String[] args) {
        Offer09 queue = new Offer09();
        System.out.println(queue.deleteHead());
        queue.appendTail(12);
        System.out.println(queue.deleteHead());
        queue.appendTail(10);
        queue.appendTail(9);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        queue.appendTail(20);
        System.out.println(queue.deleteHead());
        queue.appendTail(1);
        queue.appendTail(8);
        queue.appendTail(20);
        queue.appendTail(1);
        queue.appendTail(11);
        queue.appendTail(2);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());

    }

}
