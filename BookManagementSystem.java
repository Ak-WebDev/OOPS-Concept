import java.util.*;

class Book {
    int bookID;
    String title, author;
    boolean isAvailable;

    //Constructor
    Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookID +
                "  Title: " + title +
                "  Author: " + author +
                " Available: " + (isAvailable ? "Yes" : "No");
    }
}

class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        books[bookCount] = book;
        bookCount++;
        System.out.println("Book added successfully.");
    }

    public void removeBook(int bookID) {
        boolean bookFound = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < bookCount - i; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null;
                bookCount--;
                bookFound = true;
                System.out.println("Book removed successfully.");
            }
        }
    }

    public void searchBook(int bookID) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book found:");
                System.out.println(books[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with id " + bookID + " " + "not found.");
        }
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books available!!");
        } else {
            System.out.println("         Library Books           ");
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i]);
            }
        }
    }
}

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library(5);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("     Library Management System     ");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add book
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();

                    Book newBook = new Book(id, title, author);
                    library.addBook(newBook);
                    break;

                case 2:
                    // Remove book
                    System.out.print("Enter Book ID to remove: ");
                    int removeID = scanner.nextInt();
                    library.removeBook(removeID);
                    break;

                case 3:
                    // Search book
                    System.out.print("Enter Book ID to search: ");
                    int searchID = scanner.nextInt();
                    library.searchBook(searchID);
                    break;

                case 4:
                    // Display all books
                    library.displayBooks();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
