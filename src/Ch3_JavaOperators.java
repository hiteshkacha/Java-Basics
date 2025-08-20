// Chapter Three: Understanding Operators in Java
// ------------------------------------------------
// Operators are special symbols that perform operations on variables and values.
// In this program, we will explore different types of operators in Java.

public class Ch3_JavaOperators {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        // ===========================
        // 1. Arithmetic Operators
        // ===========================
        System.out.println("===== Arithmetic Operators =====");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // Addition
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // Subtraction
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // Multiplication
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // Division (integer division)
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); // Modulus (remainder)

        // ===========================
        // 2. Relational Operators
        // ===========================
        System.out.println("\n===== Relational Operators =====");
        System.out.println(num1 + " == " + num2 + " ? : " + (num1 == num2)); // Equal to
        System.out.println(num1 + " != " + num2 + " ? : " + (num1 != num2)); // Not equal
        System.out.println(num1 + " > " + num2 + " ? : " + (num1 > num2));   // Greater than
        System.out.println(num1 + " < " + num2 + " ? : " + (num1 < num2));   // Less than
        System.out.println(num1 + " >= " + num2 + " ? : " + (num1 >= num2)); // Greater or equal
        System.out.println(num1 + " <= " + num2 + " ? : " + (num1 <= num2)); // Less or equal

        // ===========================
        // 3. Logical Operators
        // ===========================
        boolean a = true, b = false;
        System.out.println("\n===== Logical Operators =====");
        System.out.println(a + " && " + b + " = " + (a && b)); // Logical AND
        System.out.println(a + " || " + b + " = " + (a || b)); // Logical OR
        System.out.println("!" + a + " = " + (!a));            // Logical NOT

        // ===========================
        // 4. Assignment Operators
        // ===========================
        System.out.println("\n===== Assignment Operators =====");
        int x = 10;
        System.out.println("Initial x = " + x);
        x += 5;  // x = x + 5
        System.out.println("x += 5 → " + x);
        x -= 3;  // x = x - 3
        System.out.println("x -= 3 → " + x);
        x *= 2;  // x = x * 2
        System.out.println("x *= 2 → " + x);
        x /= 4;  // x = x / 4
        System.out.println("x /= 4 → " + x);
        x %= 3;  // x = x % 3
        System.out.println("x %= 3 → " + x);

        // ===========================
        // 5. Unary Operators
        // ===========================
        System.out.println("\n===== Unary Operators =====");
        int y = 5;
        System.out.println("y = " + y);
        System.out.println("++y = " + (++y)); // Pre-increment: increase then use
        System.out.println("y++ = " + (y++)); // Post-increment: use then increase
        System.out.println("--y = " + (--y)); // Pre-decrement
        System.out.println("y-- = " + (y--)); // Post-decrement
        System.out.println("Final y = " + y);

        // ===========================
        // 6. Ternary Operator
        // ===========================
        System.out.println("\n===== Ternary Operator =====");
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Max of " + num1 + " and " + num2 + " = " + max);

        // ===========================
        // 7. Bitwise Operators
        // ===========================
        System.out.println("\n===== Bitwise Operators =====");
        int bit1 = 6; // 110 in binary
        int bit2 = 3; // 011 in binary
        System.out.println(bit1 + " & " + bit2 + " = " + (bit1 & bit2)); // AND
        System.out.println(bit1 + " | " + bit2 + " = " + (bit1 | bit2)); // OR
        System.out.println(bit1 + " ^ " + bit2 + " = " + (bit1 ^ bit2)); // XOR
        System.out.println("~" + bit1 + " = " + (~bit1));                // NOT
        System.out.println(bit1 + " << 1 = " + (bit1 << 1));             // Left shift
        System.out.println(bit1 + " >> 1 = " + (bit1 >> 1));             // Right shift
    }
}
