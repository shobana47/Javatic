import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private int numberOfCopies;

    // Constructor
    public Book(String title, String author, double price, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.numberOfCopies = numberOfCopies;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
        System.out.println("Number of Copies: " + numberOfCopies);
    }

    // Static method to get book details from user
    public static Book getBookDetailsFromUser(Scanner scanner) {        
        
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        
        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter number of copies: ");
        int numberOfCopies = scanner.nextInt();
        
        scanner.nextLine(); // consume the leftover newline
        
        return new Book(title, author, price, numberOfCopies);
    }
}

public class booksys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t**********************************");
        System.out.println("\t\tBOOKSTORE INVENTORY MANAGEMENT ");
        System.out.println("\t\t**********************************");

        Book[] books = new Book[3];

        // Get details for each book
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            books[i] = Book.getBookDetailsFromUser(scanner);
            System.out.println();
        }

        // Display all books' details
        System.out.println("Books in the inventory:");
        for (Book book : books) {
            book.displayDetails();
            System.out.println();
        }

        scanner.close();
    }
}
