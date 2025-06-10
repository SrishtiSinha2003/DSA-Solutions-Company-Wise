import java.util.Stack;

public class ValidStackSequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int x : pushed) {
            stack.push(x);
            while (!stack.isEmpty() && j < popped.length && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        ValidStackSequence vss = new ValidStackSequence();
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        System.out.println(vss.validateStackSequences(pushed, popped)); // Output: true
    }
}
