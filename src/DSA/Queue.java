package DSA;

import java.util.Scanner;

public class Queue {
    private final int fixed_size = 100;
    int[] queue = new int[fixed_size];
    int front;
    int rear;

    public Queue() {
        front = -1;
        rear = -1;
    }


    boolean isEmpty() {
        return rear == -1;
    }


    boolean isFull() {
        return rear == fixed_size - 1;
    }


    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is overflow...");
            return;
        }

        if (isEmpty()) {
            front++;
        }

        queue[++rear] = element;
        System.out.println("Element: " + element + " enqueued successfully.");
    }


    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty...");
            return;
        }

        System.out.println("Element: " + queue[front] + " dequeued successfully.");
        if (rear == front) {
            front = -1;
            rear = -1;
            return;
        }
        front++;
    }


    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty...");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }


    static void main() {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;

        Queue queue = new Queue();

        while (menu) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display the queue");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an element: ");
                    int element = scan.nextInt();
                    queue.enQueue(element);
                    break;
                case 2:
                    queue.deQueue();
                    break;
                case 3:
                    queue.display();
                    break;
                default:
                    menu = false;
                    break;
            }
        }
    }
}
