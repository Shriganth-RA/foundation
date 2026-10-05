package tasks;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    long id;
    String name;
    String author;
    long publication_year;

    public Book(Long id, String name, String author, long publication_year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publication_year = publication_year;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                "\nName: " + name +
                "\nAuthor: " + author +
                "\nPublication year: " + publication_year;
    }
}

public class BookManagementSystem {
    ArrayList<Book> books = new ArrayList<>();

    public long generateId() {
        return (long) (Math.random() * 1000);
    }

    public void addBook(String name, String author, long publication_year) {
        long id = generateId();
        books.add(new Book(id, name, author, publication_year));
        System.out.println("\nBook id: " + id + " added successfully.");
    }

    public void displayById() {
        System.out.println("\nBook-Id");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).id);
        }
    }

    public void displayByName() {
        System.out.println("\nBook-Name");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).name);
        }
    }

    public void displayByAuthor() {
        System.out.println("\nAuthor");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).author);
        }
    }

    public void display() {
        System.out.println();
        for (Book book : books) {
            System.out.println(book.id + " ---> " + book.name + " ---> " + book.author + " ---> " + book.publication_year);
        }
    }

    static void main() {
        Scanner scan = new Scanner(System.in);
        BookManagementSystem bms = new BookManagementSystem();
        boolean menu = true;

        while (menu) {
            System.out.println("\n1. Add new book.");
            System.out.println("2. Display books.");
            System.out.println("3. Exit.");

            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter book name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scan.nextLine();
                    System.out.print("Enter publishing year: ");
                    long publishing_year = scan.nextLong();
                    scan.nextLine();
                    bms.addBook(name, author, publishing_year);
                    break;
                case 2:
                    boolean display_menu = true;
                    while (display_menu) {
                        System.out.println("\n1. Display Id.");
                        System.out.println("2. Display Book-name.");
                        System.out.println("3. Display Author.");
                        System.out.println("4. Display all Books.");
                        System.out.println("5. Exit.");

                        System.out.print("Enter your choice: ");
                        int display_choice = scan.nextInt();
                        scan.nextLine();

                        switch (display_choice) {
                            case 1:
                                bms.displayById();
                                break;
                            case 2:
                                bms.displayByName();
                                break;
                            case 3:
                                bms.displayByAuthor();
                                break;
                            case 4:
                                bms.display();
                                break;
                            default:
                                display_menu = false;
                        }
                    }
                    break;
                default:
                    menu = false;
                    break;
            }
        }
    }
}
