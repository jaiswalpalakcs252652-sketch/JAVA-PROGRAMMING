package collectionsandproductscores;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionsAndProductScores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DEMONSTRATING  MAP  INTERFACE");
        Map<String, Double> productScores = new HashMap<>();
        System.out.println("Enter scores for 3 products (product name, score):");
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Enter product name " + (i + 1) + ": ");
            String productName = input.next();

            System.out.print("Enter score for " + productName + ": ");
            double score = input.nextDouble();

            productScores.put(productName, score);
        }
        System.out.println("Initial Map: " + productScores);
        double totalScore = 0;
        for (Double score : productScores.values()) {
            totalScore += score;
        }
        System.out.println("Total score of all products: " + totalScore);
        System.out.print("Enter a product name to update its score: ");
        String productToUpdate = input.next();

        if (productScores.containsKey(productToUpdate))
        {
            System.out.print("Enter the new score for " + productToUpdate + ": ");
            double newScore = input.nextDouble();

            productScores.put(productToUpdate, newScore);
            System.out.println("Map after updating " + productToUpdate + ": " + productScores);
        } else {
            System.out.println(productToUpdate + " not found in the map.");
        }
        totalScore = 0;
        for (Double score : productScores.values()) 
        {
            totalScore += score;
        }

        System.out.println("New total score: " + totalScore);
        System.out.print("Enter a product name to remove: ");
        String productToRemove = input.next();
        if (productScores.remove(productToRemove) != null)
        {
            System.out.println(productToRemove + " removed. New Map: " + productScores);
        } else {
            System.out.println(productToRemove + " not found in the map.");
        }

        input.close();
    }
}