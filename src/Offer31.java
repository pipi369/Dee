import java.util.Stack;

public class Offer31 {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pi = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[pi]) {
                stack.pop();
                pi++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = new int[]{1, 2, 3, 4, 5};
        int[] popped = new int[]{4, 3, 5, 1, 2};
        System.out.println(validateStackSequences(pushed, popped));
    }
}
