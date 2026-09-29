package DSA;

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node (int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    boolean isEmpty() {
        return head == null;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            System.out.println("Data: " + data + " added successfully.");
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        System.out.println("Data: " + data + " added successfully.");
    }


    void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            System.out.println("Data: " + data + " added successfully.");
            return;
        }

        Node current = head;
        head = newNode;
        newNode.next = current;

        System.out.println("Data: " + data + " added successfully.");
    }


    void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            if (pos == 1) {
                head = newNode;
                System.out.println("Data: " + data + " inserted at index-" + pos + " successfully.");
            } else {
                System.out.println("Invalid position...");
            }
            return;
        }

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            System.out.println("Data: " + data + " inserted at index-" + pos + " successfully.");
            return;
        }

        Node current = head;

        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position...!");
            return;
        }

        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;

        System.out.println("Data: " + data + " inserted at index-" + pos + " successfully.");
    }


    void searchByValue(int data) {
        Node current = head;
        int index = 0;

        if (isEmpty()) {
            System.out.println("List is empty...");
            return;
        }

        while (current != null) {
            if (current.data == data) {
                System.out.println("Data: " + data + " found at index-" + index);
                return;
            }
            index++;
            current = current.next;
        }

        System.out.println("Data not found...!");
    }


    void deleteAtHead() {
        Node deleted = head;

        if (isEmpty()) {
            System.out.println("List is empty...");
            return;
        }

        head = deleted.next;
        deleted.next = null;

        System.out.println("Data: " + deleted.data + " deleted successfully.");
    }


    void deleteByValue(int data) {
        Node current = head;

        if (isEmpty()) {
            System.out.println("List is empty...");
            return;
        }

        if (current.data == data) {
            head = current.next;
            System.out.println("Data: " + data + " deleted successfully.");
            return;
        }

        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Data not found...!");
            return;
        }

        current.next = current.next.next;

        System.out.println("Data: " + data + " deleted successfully.");
    }


    void deleteAtEnd() {
        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        Node deleted = current.next;
        current.next = null;

        System.out.println("Data: " + deleted.data + " deleted successfully.");
    }


    void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    static void main() {
        Scanner scan = new Scanner(System.in);
        SinglyLinkedList sll = new SinglyLinkedList();

        boolean menu = true;

        while (menu) {
            System.out.println("\n1. Insert element at head");
            System.out.println("2. Insert element at particular position");
            System.out.println("3. Insert element at end");
            System.out.println("4. Search element");
            System.out.println("5. Delete element at head");
            System.out.println("6. Delete element by data");
            System.out.println("7. Delete element at last");
            System.out.println("8. Display list");
            System.out.println("9. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scan.nextInt();

            int data = 0;
            int position = 0;

            switch (choice) {
                case 1:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    sll.insertAtHead(data);
                    break;
                case 2:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    System.out.print("Enter a index: ");
                    position = scan.nextInt();
                    sll.insertAtPos(data, position);
                    break;
                case 3:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    sll.insertAtEnd(data);
                    break;
                case 4:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    sll.searchByValue(data);
                    break;
                case 5:
                    sll.deleteAtHead();
                    break;
                case 6:
                    System.out.print("Enter an element: ");
                    data = scan.nextInt();
                    sll.deleteByValue(data);
                    break;
                case 7:
                    sll.deleteAtEnd();
                    break;
                case 8:
                    sll.display();
                    break;
                default:
                    menu = false;
                    break;
            }
        }
    }
}