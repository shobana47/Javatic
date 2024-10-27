import java.util.Scanner;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonTest {

    
    public static void updateAge(Person person, int newAge) {
        person.age = newAge; // Updating the age of the passed object
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Enter the person's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the person's age: ");
        int age = scanner.nextInt();

        // Creating a Person object
        Person person = new Person(name, age);

        System.out.println("\nInitial Details:");
        person.displayDetails();

        System.out.println("\nEnter the new age to update: ");
        int newAge = scanner.nextInt();
        updateAge(person, newAge);  // Pass the person object and new age

        System.out.println("\nUpdated Details:");
        person.displayDetails();

        scanner.close();
    }
}
