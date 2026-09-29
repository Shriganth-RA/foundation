package DSA;

import java.util.Scanner;

public class Stack {
    private final int fixed_size = 100;
    private final int[] stack = new int[fixed_size];
    int top = -1;


    public boolean isEmpty() {
        return top == -1;
    }


    public boolean isFull() {
        return top == fixed_size - 1;
    }


    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow...");
            return;
        }

        stack[++top] = element;
        System.out.println("Element: " + element + " pushed in the stack successfully.");
    }


    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty...");
            return;
        }

        System.out.println("Element: " + stack[top] + " popped from the stack successfully.");
        top--;
    }


    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty...");
            return;
        }

        System.out.println("Peek element: " + stack[top]);
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty...");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }

        System.out.println();
    }


    static void main() {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;

        Stack stack = new Stack();

        while (menu) {
            System.out.println("\n1. Push the element");
            System.out.println("2. Pop the element");
            System.out.println("3. Peek");
            System.out.println("4. Display the stack");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an element: ");
                    int element = scan.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                default:
                    menu = false;
                    break;
            }
        }
    }
}
