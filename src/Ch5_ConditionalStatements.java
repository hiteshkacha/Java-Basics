// Chapter Five: Conditional Statements in Java
// --------------------------------------------
// Conditional statements are used to make decisions in a program.
// Java supports if, else-if, else, and nested if-else statements.
// In this example, we will check if a person is eligible for voting.

import java.util.Scanner;

public class Ch5_ConditionalStatements {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = reader.nextInt();

        // =====================================
        // Simple if-else statement
        // =====================================
        // Syntax:
        // if (condition) {
        //      // Code runs if condition is true
        // } else {
        //      // Code runs if condition is false
        // }

        if (age >= 18) {
            System.out.println("✅ You are eligible to vote.");
        } else {
            System.out.println("❌ You are NOT eligible to vote.");
            System.out.println("Your Age is " + age);
            System.out.println("Voting age in India is 18 years or above.");
        }

        // =====================================
        // Nested if-else statement
        // =====================================
        // A nested if-else means one if statement inside another.
        // This helps when we want to check multiple conditions.

        System.out.println("\n--- Checking more conditions ---");
        if (age >= 18) {
            // First condition true → now check inside
            if (age >= 60) {
                System.out.println("You are eligible to vote ✅");
                System.out.println("You are also a Senior Citizen 👴👵");
            } else {
                System.out.println("You are eligible to vote ✅");
                System.out.println("You are an Adult.");
            }
        } else {
            // First condition false → directly goes here
            if (age < 10) {
                System.out.println("You are a child. Too young to vote ❌");
            } else {
                System.out.println("You are a teenager. You can vote after " + (18 - age) + " years ❌");
            }
        }

        reader.close(); // Always close Scanner
    }
}
