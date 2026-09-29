package DSA;

import java.util.Scanner;

public class CircularDoublyLinkedList {
    Node head;
    Node tail;

    boolean isEmpty() {
        return head == null;
    }


    void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            tail = head;
            head.next = tail;
            head.prev = tail;
            System.out.println("Data: " + data + " added successfully.");
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        tail.next = newNode;
        newNode.prev = tail;
        head = newNode;

        System.out.println("Data: " + data + " added successfully.");
    }


    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            head.next = head;
            tail = head;
            System.out.println("Data: " + data + " added successfully.");
            return;
        }

        head.prev = newNode;
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        tail = newNode;

        System.out.println("Data: " + data + " added successfully.");
    }


    void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            if (pos == 1) {
                head = newNode;
                tail = head;
                head.next = tail;
                head.prev = tail;
                System.out.println("Data: " + data + " inserted at index-"+ pos + " successfully.");
            } else {
                System.out.println("Invalid position...");
            }
            return;
        }

        if (pos == 1) {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            head = newNode;
            System.out.println("Data: " + data + " inserted at index-"+ pos + " successfully.");
            return;
        }

        Node current = head;

        for (int i = 1; i < pos - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        newNode.prev = current;
        current.next.prev = newNode;

        System.out.println("Data: " + data + " inserted at index-"+ pos + " successfully.");
    }


    void searchByValue(int data) {
        Node current = head;

        if (isEmpty()) {
            System.out.println("List is empty...");
            return;
        }

        int index = 0;

        while (current.data != data && current != tail) {
            index++;
            current = current.next;
        }

        if (current.data == data) {
            System.out.println("Data: " + data + " found at index-" + index);
        } else {
            System.out.println("Data: " + data + " not found...");
        }
    }


    void deleteAtHead() {
        if (isEmpty()) {
            System.out.println("List is empty...");
            return;
        }

        Node deleteNode = head;
        head = deleteNode.next;
        head.prev = tail;
        tail.next = head;
        System.out.println("Data: " + deleteNode.data + " deleted successfully.");
    }


    void deleteByValue(int data) {
        Node current = head;

//        if (current.data == data) {
//            head = current.next;
//            head.prev = tail;
//            tail.next = head;
//            System.out.println("Data: " + data + " deleted successfully.");
//            return;
//        }

        while (current.data != data || current.next != head) {
            current = current.next;
        }

        if (current.data == head.data) {
            head = current.next;
            head.prev = tail;
            tail.next = head;
            System.out.println("Data: " + data + " deleted successfully.");
            return;
        }

        if (current.data == tail.data) {
            tail = current.prev;
            tail.next = head;
            head.prev = tail;
            System.out.println("Data: " + data + " deleted successfully.");
            return;
        }

        Node deleteNode = current;
        deleteNode.prev.next = deleteNode.next;
        deleteNode.next.prev = deleteNode.prev;
        System.out.println("Data: " + data + " deleted successfully.");
    }


    void deleteAtTail() {
        if (isEmpty()) {
            System.out.println("List is empty...");
            return;
        }

        Node deleteNode = tail;
        tail = deleteNode.prev;
        tail.next = head;
        head.prev = tail;
        System.out.println("Data: " + deleteNode.data + " deleted successfully.");
    }


    void fTraversing() {
        Node current = head;

        System.out.print(current.data + " ");

        current = current.next;

        while (current != head) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }


    void rTraversing() {
        Node current = tail;

        System.out.print(current.data + " ");

        current = current.prev;

        while (current != tail) {
            System.out.print(current.data + " ");
            current = current.prev;
        }

        System.out.println();
    }


    static void main() {
        Scanner scan = new Scanner(System.in);
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

        boolean menu = true;

        while (menu) {
            System.out.println("\n1. Insert element at head");
            System.out.println("2. Insert element at particular position");
            System.out.println("3. Insert element at end");
            System.out.println("4. Search element");
            System.out.println("5. Delete element at head");
            System.out.println("6. Delete element by data");
            System.out.println("7. Delete element at last");
            System.out.println("8. Display list as forward traversing");
            System.out.println("9. Display list as reverse traversing");
            System.out.println("10. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scan.nextInt();

            int data = 0;
            int position = 0;

            switch (choice) {
                case 1:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    cdll.insertAtHead(data);
                    break;
                case 2:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    System.out.print("Enter a index: ");
                    position = scan.nextInt();
                    cdll.insertAtPos(data, position);
                    break;
                case 3:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    cdll.insertAtEnd(data);
                    break;
                case 4:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    cdll.searchByValue(data);
                    break;
                case 5:
                    cdll.deleteAtHead();
                    break;
                case 6:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    cdll.deleteByValue(data);
                    break;
                case 7:
                    cdll.deleteAtTail();
                    break;
                case 8:
                    cdll.fTraversing();
                    break;
                case 9:
                    cdll.rTraversing();
                    break;
                default:
                    menu = false;
                    break;
            }
        }
    }
}
