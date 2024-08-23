import java.util.Scanner;

public class attendees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] names = new String[5];

                for (int i = 0; i < 5; i++){
            System.out.print("Enter name: ");
            String name = input.nextLine();
            names[i] = name;
        }

                System.out.print("Names in Reverse Order: ");
        for (int i = names.length - 1; i >= 0; i--){
            System.out.print(names[i] + " ");
        }

                String max = "";
        for (int i = 0; i < 5; i++){
            if (names[i].length() > max.length()){
                max = names[i];
            }
        }
        System.out.println("\nLongest Name: " + max);

                String min = max;
        for (int i = 0; i < 5; i++){
            if (names[i].length() < min.length()){
                min = names[i];
            }
        }
        System.out.println("Shortest Name: " + min);

    }
}