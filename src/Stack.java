import java.util.LinkedList;
import java.util.Queue;

public class Stack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int topElement;

    public Stack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.add(x);
        topElement = x;
    }

    public int pop() {
        while (queue1.size() > 1) {
            topElement = queue1.remove();
            queue2.add(topElement);
        }
        int popped = queue1.remove();

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return popped;
    }

    public int top() {
        return topElement;
    }

    public boolean isEmpty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); 
        System.out.println("Popped element: " + stack.pop()); 

        System.out.println("Top element: " + stack.top()); 
        System.out.println("Is the stack empty? " + stack.isEmpty());

        stack.pop();
        stack.pop();
        System.out.println("Is the stack empty? " + stack.isEmpty()); 
    }
}
