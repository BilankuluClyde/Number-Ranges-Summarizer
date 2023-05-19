package src;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        NumberSummary numSummary = new NumberSummary();
        System.out.print("Input: "); 
        
        /* Get user input, and pass it as a collection to the Number Summarry class to print out the
         * summary of numbers 
         */
        String input = new Scanner(System.in).nextLine();
        System.out.println("Result: " + numSummary.summarizeCollection(numSummary.collect(input)));
    }
}
