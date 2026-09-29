package DSA;


class Item {
    int value;
    int priority;

    public Item(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}

public class PriorityQueue {
    Item[] priorityQueue;
    int size;

    public PriorityQueue(int c) {
        priorityQueue = new Item[c];
        size = 0;
    }

    boolean isEmpty() {
        return size == -1;
    }


    boolean isFull() {
        return size == priorityQueue.length - 1;
    }


    void enqueue(int value, int priority) {
        if (isFull()) {
            System.out.println("Queue overflow...");
            return;
        }

        Item newItem = new Item(value, priority);
        priorityQueue[size] = newItem;
        size = size + 1;
        System.out.println("Value: " + value + " is enqueued successfully.");
    }


    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty...");
            return;
        }

        int MAX_PRIORITY = Integer.MIN_VALUE;
        int index = -1;
        for (int j = 0; j < size; j++) {
            if (MAX_PRIORITY < priorityQueue[j].priority ||
                    (MAX_PRIORITY == priorityQueue[j].priority && priorityQueue[j].value > priorityQueue[index].value)) {
                MAX_PRIORITY = priorityQueue[j].priority;
                index = j;
            }
        }

        if (index != -1) {
            System.out.println("The highest priority element of the priority queue is " + priorityQueue[index].value);
        } else {
            System.out.println("Queue is empty...");
        }
    }


    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty...");
            return;
        }

        int MAX_PRIORITY = Integer.MIN_VALUE;
        int index = -1;
        for (int j = 0; j < size; j++) {
            if (MAX_PRIORITY < priorityQueue[j].priority ||
                    (MAX_PRIORITY == priorityQueue[j].priority && priorityQueue[j].value > priorityQueue[index].value)) {
                MAX_PRIORITY = priorityQueue[j].priority;
                index = j;
            }
        }

        if (index != -1) {
            System.out.println("Element of value: " + priorityQueue[index].value + " with priority: " + priorityQueue[index].priority + " is deleted from the priority queue.");
            priorityQueue[index] = priorityQueue[size - 1];
            size = size - 1;
        } else {
            System.out.println("Queue is empty...");
        }
    }


    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty...");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(priorityQueue[i].value + " ");
        }

        System.out.println();
    }

    static void main() {
        PriorityQueue pq = new PriorityQueue(10);

        pq.enqueue(10, 6);
        pq.enqueue(20, 9);
        pq.enqueue(30, 8);
        pq.enqueue(40, 3);
        pq.enqueue(50, 5);
        pq.enqueue(60, 2);

        pq.dequeue();
        pq.dequeue();

        pq.peek();

        pq.display();
    }
}
