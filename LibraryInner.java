import java.util.*;

public class LibraryInner 
{
    class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    private ArrayList<Book> books;

    public LibraryInner() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println("Book " + (i + 1) + ":");
                books.get(i).displayDetails();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        LibraryInner library = new LibraryInner();

        System.out.println("Enter the number of books to add: ");
        int numBooks = input.nextInt();
        input.nextLine();  // Consume newline

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter title of book " + (i + 1) + ":");
            String title = input.nextLine();
            System.out.println("Enter author of book " + (i + 1) + ":");
            String author = input.nextLine();

            library.addBook(title, author);
        }

        System.out.println("\nBooks in the library:");
        library.displayBooks();

        input.close();
    }
}
