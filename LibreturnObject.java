import java.util.*;
class Library
{
    String title;
    String author;
    
    Library(String title,String author)
    {
        this.title=title;
        this.author=author;
    }
    void displaydetails()
    {
        System.out.println("Title: "+title+"\nAuthor: "+author);
    }
}
public class LibreturnObject
{
    public static Library createlib(String title,String author)
    {
        return new Library(title,author);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("Enter the title of the book:");
        String title=input.nextLine();
        System.out.println("Enter the name of the author:");
        String author=input.nextLine();
        Library lib=createlib(title,author);

        System.out.println("Library details:");
        lib.displaydetails();
        System.out.println();
    }
}
}