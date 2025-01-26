// Sarina Khara
// CS 1400
// Assignment 2
// 9/10/24

import java.util.Scanner; // Importing Scanner class for user input

// This program calculates the total bill per person, including tip and tax, when dining out with a group
public class TaskB {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); // Creating a Scanner object to read user input
        
        // Asking the user for the number of people in their party
        System.out.println("How many people are in your party? ");
        double amountOfPeople = scan.nextDouble(); // Storing the number of people
        
        // Asking the user for the total bill amount before tax and tip
        System.out.println("What is the total bill before tax and tip? ");
        double originalBill = scan.nextDouble(); // Storing the original bill amount
        
        // Calculating the tip amount (20% of the original bill)
        double tip = 0.20 * originalBill;
        
        // Adding the tip to the original bill
        double billWithTip = originalBill + tip;
        
        // Calculating the tax amount (7.25% of the bill including tip)
        double tax = 0.0725 * billWithTip;
        
        // Calculating the final total bill including tip and tax
        double finalBill = billWithTip + tax;
        
        // Calculating how much each person needs to pay
        double billPerPerson = finalBill / amountOfPeople;
        
        // Displaying the final amount each person owes
        System.out.println("The amount due per person after tax and tip is $" + billPerPerson);

        scan.close(); // Closing the scanner to prevent resource leaks
    }
}
