// Chapter Six: Looping Statements in Java
// --------------------------------------
// Looping statements are used to execute a block of code repeatedly.
// Java supports for loop, while loop, and do-while loop.

import java.util.Scanner;

public class Ch6_LoopingStatements {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // =====================================
        // For Loop Example
        // =====================================
        // Syntax:
        // for (initialization; condition; update) {
        //     // Code runs repeatedly
        // }

        System.out.println("🔁 For Loop Example:");
        System.out.print("Enter a number to print its table: ");
        int num = reader.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // =====================================
        // While Loop Example
        // =====================================
        // Syntax:
        // while (condition) {
        //     // Code runs while condition is true
        // }

        System.out.println("\n🔁 While Loop Example:");
        int count = 1;

        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++; // Increment to avoid infinite loop
        }

        // =====================================
        // Do-While Loop Example
        // =====================================
        // Syntax:
        // do {
        //     // Code runs at least once
        // } while (condition);

        System.out.println("\n🔁 Do-While Loop Example:");
        int number;

        do {
            System.out.print("Enter a number greater than 10: ");
            number = reader.nextInt();
        } while (number <= 10);

        System.out.println("✅ You entered a valid number: " + number);

        // =====================================
        // Nested Loop Example
        // =====================================
        // Loop inside another loop

        System.out.println("\n🔁 Nested Loop Example (Pattern):");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }

        reader.close(); // Always close Scanner
    }
}