import java.util.*;
public class UniqueNameSet 
{
    public static void main(String[] args) 
{
        HashSet<String>namesSet=new HashSet<>();

        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Enter names (type 'stop' to finish):");
        while (true) {
            name = input.nextLine();

            if (name.equalsIgnoreCase("stop")) {
                break;
            }

            namesSet.add(name);
        }
        System.out.println("\nUnique names entered:");
        for (String uniqueName : namesSet) {
            System.out.println(uniqueName);
        }

        input.close();
    }
}
