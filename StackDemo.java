import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(29);
        stack.push(50);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
