package collectionsandmathdemo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Collections; 
import java.util.Iterator;
import java.util.Scanner;

public class CollectionsAndMathDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DEMONSTRATING  LIST  INTERFACE");
        List<Double> numbersList = new ArrayList<>();
        System.out.println("Enter 5 numbers for the list:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbersList.add(input.nextDouble());
        }
        System.out.println("Initial List: " + numbersList);
        double sumList = 0;
        for (Double num : numbersList) 
        {
            sumList += num;
        }
        System.out.println("Sum of list elements: " + sumList);
        if (!numbersList.isEmpty()) 
        {
            System.out.println("Average of list elements: " + (sumList / numbersList.size()));
        }
        if (!numbersList.isEmpty()) 
        {
            System.out.println("Minimum element in list: " + Collections.min(numbersList));
            System.out.println("Maximum element in list: " + Collections.max(numbersList));
        }
        System.out.print("Enter a number to remove from the list: ");
        double numToRemove = input.nextDouble();
        if (numbersList.remove(numToRemove)) 
        {
            System.out.println(numToRemove + " removed. New List: " + numbersList);
        } else {
            System.out.println(numToRemove + " not found in the list.");
        }
        sumList = 0;
        for (Double num : numbersList)
        {
            sumList += num;
        }
        System.out.println("New sum of list elements: " + sumList);
        if (!numbersList.isEmpty())
        {
            System.out.println("New average of list elements: " + (sumList / numbersList.size()));
        }
        System.out.println("List cleared.");
        numbersList.clear();      
    }
}
