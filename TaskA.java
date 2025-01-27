// Sarina Khara
// CS 1400
// Assignment 2
// 9/10/24

// testing
// hello

import java.util.Scanner; // Importing Scanner class for user input

// This program calculates the required ingredient amounts for making shortbread cookies based on user input
public class TaskA {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); // Creating a Scanner object to read user input
        
        // Defining ingredient quantities for 24 pieces of shortbread
        double total = 24; 
        double butterG = 125;   // Butter in grams
        double butterOz = 4;    // Butter in ounces
        double sugarG = 55;     // Sugar in grams
        double sugarOz = 2;     // Sugar in ounces
        double plainflourG = 180; // Flour in grams
        double plainflourOz = 6;  // Flour in ounces

        // Prompting user to enter the desired number of shortbread pieces
        System.out.println("Enter the number of shortbread you want to make: ");
        double userInput = scan.nextDouble(); // Storing user input
        
        // Calculating new ingredient quantities based on user input
        double newTotal = userInput / total; // Ratio to adjust ingredient quantities
        double newButterG = newTotal * butterG;
        double newButterOz = newTotal * butterOz;
        double newSugarG = newTotal * sugarG;
        double newSugarOz = newTotal * sugarOz;
        double newPlainflourG = newTotal * plainflourG;
        double newPlainflourOz = newTotal * plainflourOz;
        
        // Displaying the required ingredient quantities
        System.out.println("To make " + userInput + " pieces of shortbread you will need the following ingredients: ");
        System.out.println("Butter: " + newButterG + "g/" + newButterOz + "oz");
        System.out.println("Sugar: " + newSugarG + "g/" + newSugarOz + "oz");
        System.out.println("Plain Flour: " + newPlainflourG + "g/" + newPlainflourOz + "oz");


        scan.close(); // Closing the scanner to prevent resource leaks
    }
}
