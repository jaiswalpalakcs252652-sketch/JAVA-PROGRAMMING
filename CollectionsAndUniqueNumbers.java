package collectionsanduniquenumbers;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionsAndUniqueNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("DEMONSTRATING  SET  INTERFACE");

        Set<Integer> uniquenumbers = new HashSet<>();

        System.out.println("Enter 5 integer values for the set (duplicates will be ignored):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            uniquenumbers.add(input.nextInt());
        }

        System.out.println("Initial Set: " + uniquenumbers);

        int sumSet = 0;
        for (Integer num : uniquenumbers) {
            sumSet += num;
        }

        System.out.println("Sum of set elements: " + sumSet);

        Set<Integer> squaredNumbers = new HashSet<>();
        for (Integer num : uniquenumbers) {
            squaredNumbers.add(num * num);
        }

        System.out.println("Set of squared numbers: " + squaredNumbers);

        System.out.print("Enter an integer to remove from the set: ");
        int intToRemove = input.nextInt();

        if (uniquenumbers.remove(intToRemove)) {
            System.out.println(intToRemove + " removed. New Set: " + uniquenumbers);
        } else {
            System.out.println(intToRemove + " not found in the set.");
        }

        input.close();
    }
}