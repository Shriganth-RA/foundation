package DSA;

public class QueueandStack {
    int size;
    int[] queueStack;
    int front;
    int rear;

    public QueueandStack(int size) {
        this.size = size;
        queueStack = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return rear == -1;
    }

    boolean isFull() {
        return rear == size - 1;
    }

    void enQueue(int data) {
        if (isFull()) {
            System.out.println("QueueStack is full...");
            return;
        }

        if (isEmpty()) {
            front++;
            queueStack[++rear] = data;
            System.out.println("Data: " + data + " is enqueued successfully...");
            return;
        }

        queueStack[++rear] = data;
        System.out.println("Data: " + data + " is enqueued successfully...");
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("QueueStack is empty...");
            return;
        }

        int dequeue = queueStack[front];
        for (int i = front; i < rear; i++) {
            queueStack[i] = queueStack[i + 1];
        }
        rear--;
        System.out.println("Data: " + dequeue + " is dequeued successfully...");
    }

    void display() {
        if (isEmpty()) {
            System.out.println("QueueStack is empty...");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queueStack[i] + " ");
        }

        System.out.println();
    }

    static void main() {
        QueueandStack qus = new QueueandStack(5);
        qus.enQueue(10);
        qus.enQueue(20);
        qus.enQueue(30);
        qus.enQueue(40);
        qus.enQueue(50);

        qus.display();

        qus.deQueue();
        qus.deQueue();

        qus.display();
    }
}
