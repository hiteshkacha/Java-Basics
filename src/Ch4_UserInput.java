// Chapter Four: Taking User Input in Java
// -----------------------------------------
// In this program, we will learn how to take input from users
// using the Scanner class in Java. We will accept numbers,
// characters, strings, and then create a simple "Student Registration Form".

import java.util.Scanner; // Import the Scanner class (used for input)

public class Ch4_UserInput {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from the console
        Scanner reader = new Scanner(System.in);

        // ==========================
        // 1. Basic Input Examples
        // ==========================
        System.out.print("Enter an integer: ");
        int integer = reader.nextInt();   // Reads an integer
        reader.nextLine(); // Clears the leftover newline (important!)

        System.out.print("Enter a Character Value: ");
        char character = reader.next().charAt(0); // Reads a single character
        reader.nextLine(); // Clears buffer again

        System.out.print("Enter String value: ");
        String string = reader.nextLine(); // Reads a full line (with spaces)

        // Printing the entered values
        System.out.println("\n====================");
        System.out.println("Your Entered Details");
        System.out.println("====================");
        System.out.println("Your Integer   : " + integer);
        System.out.println("Your Character : " + character);
        System.out.println("Your String    : " + string);

        // ==========================
        // 2. Mini Project: Student Registration Form
        // ==========================
        System.out.println("\n===============================");
        System.out.println("      Student Registration Form");
        System.out.println("===============================");

        System.out.print("Enter your name          : ");
        String name = reader.nextLine(); // Reads full name

        System.out.print("Enter your phone number  : ");
        String phoneNumber = reader.nextLine(); // Reads number as String (safe for long numbers)

        System.out.print("Enter your email         : ");
        String email = reader.nextLine();

        System.out.print("Enter your address       : ");
        String address = reader.nextLine();

        // Printing submitted details
        System.out.println("\n===============================");
        System.out.println("      Your Submitted Details");
        System.out.println("===============================");
        System.out.println("Name          : " + name);
        System.out.println("Phone Number  : " + phoneNumber);
        System.out.println("Email         : " + email);
        System.out.println("Address       : " + address);

        // Always close the Scanner to avoid memory leaks
        reader.close();
    }
}
