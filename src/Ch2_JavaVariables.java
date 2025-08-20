// Chapter Two: Understanding Variables and Data Types in Java
// -----------------------------------------------------------
// In this program, we will explore different types of variables
// in Java. Each variable has a type (like int, float, char, etc.)
// and a value. Variables are used to store data in memory.

public class Ch2_JavaVariables {
    public static void main(String[] args) {

        // ======================
        // Integer Data Types
        // ======================
        byte varByte = 127;         // 1 byte, range: -128 to 127
        short varShort = 32767;     // 2 bytes, range: -32,768 to 32,767
        int varInt = 100000;        // 4 bytes, commonly used integer type
        long varLong = 10000000000L; // 8 bytes, add 'L' for long literals

        // ======================
        // Floating-Point Types
        // ======================
        float varFloat = 3.14f;     // 4 bytes, add 'f' to indicate float literal
        double varDouble = 3.14159265359; // 8 bytes, default for decimal values

        // ======================
        // Character & String Types
        // ======================
        char varChar = 'A';         // Stores a single character
        String varString = "Hello World"; // Stores a sequence of characters

        // ======================
        // Boolean Type
        // ======================
        boolean varBoolean = true;  // Can store only true or false

        // ======================
        // Printing the values
        // ======================
        System.out.println("===== Integer Types =====");
        System.out.println("Byte    : " + varByte);
        System.out.println("Short   : " + varShort);
        System.out.println("Int     : " + varInt);
        System.out.println("Long    : " + varLong);

        System.out.println("\n===== Floating Types =====");
        System.out.println("Float   : " + varFloat);
        System.out.println("Double  : " + varDouble);

        System.out.println("\n===== Character & String =====");
        System.out.println("Char    : " + varChar);
        System.out.println("String  : " + varString);

        System.out.println("\n===== Boolean Type =====");
        System.out.println("Boolean : " + varBoolean);
    }
}
