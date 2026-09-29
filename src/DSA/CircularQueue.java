package DSA;

public class CircularQueue {
    int front;
    int rear;
    int capacity;
    int size;
    int[] circularQueue;

    public CircularQueue(int capacity) {
        this.front = -1;
        this.rear = -1;
        this.size = -1;
        this.capacity = capacity;
        this.circularQueue = new int[capacity];
    }


    boolean isFull() {
        return size == capacity;
    }


    boolean isEmpty() {
        return size == -1;
    }


    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is overflow...");
            return;
        }


    }


    static void main() {

    }
}
