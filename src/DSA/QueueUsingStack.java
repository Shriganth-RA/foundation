package DSA;

import java.util.Stack;

public class QueueUsingStack<T> {
    int top;
    int bottom;
    Stack<T> stack = new Stack<>();

    public QueueUsingStack() {
        top = -1;
        bottom = -1;
    }

    public void add(T data) {
        if (stack.isEmpty()) {
            top++;
            bottom++;
            stack.push(data);
            System.out.println("Data: " + data + " added to the stack successfully.");
            return;
        }
        top++;
        stack.push(data);
        System.out.println("Data: " + data + " added to the stack successfully.");
    }

    public void remove() {
        T deleted = stack.lastElement();
        for (int i = bottom + 1; i <= top; i++) {
            stack.set(i - 1, stack.elementAt(i));
        }
        top--;
        System.out.println("Data: " + deleted + " removed from the stack successfully.");
    }

    public void front() {
        if (stack.isEmpty()) {
            System.out.println("Stack is underflow...");
            return;
        }
        System.out.println("Data: " + stack.peek() + " is top of the stack.");
    }

    public void display() {
        for (int i = top; i >= bottom; i--) {
            System.out.print(stack.elementAt(i) + " ");
        }
        System.out.println();
    }

    static void main() {
        QueueUsingStack<Integer> stack1 = new QueueUsingStack<>();
        stack1.add(10);
        stack1.add(20);
        stack1.add(30);
        stack1.add(40);
        stack1.add(50);

        stack1.display();

        stack1.remove();
        stack1.remove();

        stack1.display();
    }
}
