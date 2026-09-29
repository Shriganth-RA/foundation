package DSA;

import java.util.Scanner;

public class DoublyLinkedList {
    Node head;
    Node tail;

    boolean isEmpty() {
        return head == null;
    }


    void insert(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            System.out.println("Data: " + data + " added successfully.");
            return;
        }

        tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        System.out.println("Data: " + data + " added successfully.");
    }


    void insetAtHead(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            System.out.println("Data: " + data + " added successfully.");
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;

        System.out.println("Data: " + data + " added successfully.");
    }


    void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            if (pos == 1) {
                head = newNode;
                System.out.println("Data: " + data + " inserted at index-"+ pos + " successfully.");
            } else {
                System.out.println("Invalid position...");
            }
            return;
        }

        if (pos == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            System.out.println("Data: " + data + " inserted at index-"+ pos + " successfully.");
            return;
        }

        Node current = head;

        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position...");
            return;
        }

        Node nextNode = current.next;

        newNode.prev = current;
        newNode.next = nextNode;
        current.next = newNode;

        if (nextNode != null) {
            nextNode.prev = newNode;
        }

        System.out.println("Data: " + data + " inserted at index-"+ pos + " successfully.");
    }


    void searchByValue(int data) {
        Node current = head;
        int index = 0;

        while (current.next != null) {
            if (current.data == data) {
                System.out.println("Data: " + data + " found at index-" + index);
                return;
            }
            index++;
            current = current.next;
        }

        System.out.println("Data: " + data + " not found...");
    }


    void deleteAtHead() {
        Node current = head;

        if (isEmpty()) {
            System.out.println("List is empty...");
            return;
        }

        head = current.next;
        head.prev = null;

        System.out.println("Data: " + current.data + " deleted successfully.");
    }


    void deleteAtLast() {
        Node current = tail;

        if (isEmpty()) {
            System.out.println("List is empty...");
            return;
        }

        tail = current.prev;
        tail.next = null;

        System.out.println("Data: " + current.data + " deleted successfully.");
    }


    void deleteByValue(int data) {
        Node current = head;

        if (isEmpty()) {
            System.out.println("List is empty...");
            return;
        }

        if (current.data == data) {
            head = current.next;
            head.prev = null;
            System.out.println("Data: " + data + " deleted successfully.");
            return;
        }

        while (current.next.data != data) {
            current = current.next;
        }

        if (current.next.next == null) {
            current.next = null;
            System.out.println("Data: " + data + " deleted successfully.");
            return;
        }

        current.next = current.next.next;
        current.next.next.prev = current;

        System.out.println("Data: " + data + " deleted successfully.");
    }


    void fTraversing() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }


    void rTraversing() {
        Node current = tail;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }

        System.out.println();
    }

    static void main() {
        Scanner scan = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

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
                    dll.insetAtHead(data);
                    break;
                case 2:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    System.out.print("Enter a index: ");
                    position = scan.nextInt();
                    dll.insertAtPos(data, position);
                    break;
                case 3:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    dll.insert(data);
                    break;
                case 4:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    dll.searchByValue(data);
                    break;
                case 5:
                    dll.deleteAtHead();
                    break;
                case 6:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    dll.deleteByValue(data);
                    break;
                case 7:
                    dll.deleteAtLast();
                    break;
                case 8:
                    dll.fTraversing();
                    break;
                case 9:
                    dll.rTraversing();
                    break;
                default:
                    menu = false;
                    break;
            }
        }
    }
}












