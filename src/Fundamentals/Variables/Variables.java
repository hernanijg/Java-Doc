package fundamentals.variables;

/**
 * VARIABLES IN JAVA - DEMONSTRATION
 *
 * This class demonstrates the different types of variables in Java,
 * including their ranges, memory usage, and best practices.
 *
 * Reference: Oracle Java Documentation - Primitive Data Types
 */
public class Variables {
    public static void main(String[] args) {
        demonstrateNumericVariables();
        demonstrateBooleanVariables();
        demonstrateTextVariables();
    }

    /** (SEE 1A1 FOR MORE INFORMATION)
     * NUMERIC DATA TYPES
     * Demonstrates the different numeric primitive types and their wrappers
     */
    private static void demonstrateNumericVariables() {
        System.out.println("\n=== NUMERIC TYPES ===");

        // Integer types
        byte maxByte = Byte.MAX_VALUE;          // 8-bit (-128 to 127)
        short maxShort = Short.MAX_VALUE;      // 16-bit (-32,768 to 32,767)
        int maxInt = Integer.MAX_VALUE;        // 32-bit (-2^31 to 2^31-1)
        long maxLong = Long.MAX_VALUE;          // 64-bit (-2^63 to 2^63-1)

        // Floating-point types (1A2)
        float piFloat = 3.1416f;               // 32-bit single precision
        double piDouble = 3.1415926535;        // 64-bit double precision

        // Scientific notation examples (1B3)
        double scientificNotation = 4.71E2;    // 471.0
        double smallScientific = 4.71E-2;      // 0.0471

        // Display information
        System.out.printf("Byte (8-bit) max: %d%n", maxByte);
        System.out.printf("Short (16-bit) max: %d%n", maxShort);
        System.out.printf("Int (32-bit) max: %d%n", maxInt);
        System.out.printf("Long (64-bit) max: %d%n", maxLong);
        System.out.printf("Float precision: %.4f%n", piFloat);
        System.out.printf("Double precision: %.10f%n", piDouble);
        System.out.printf("Scientific 4.71E2: %.1f%n", scientificNotation);
        System.out.printf("Scientific 4.71E-2: %.4f%n", smallScientific);
    }

    /** (SEE 1B1 FOR MORE INFORMATION)
     * BOOLEAN DATA TYPE
     * Demonstrates boolean values and their wrapper class
     */
    private static void demonstrateBooleanVariables() {
        System.out.println("\n=== BOOLEAN TYPE ===");

        // Primitive boolean
        boolean isJavaFun = true;
        boolean isFishMammal = false;

        // Wrapper class
        Boolean isSunStar = Boolean.TRUE;

        // Logical expression
        boolean isSumCorrect = (1 + 2 == 3);  // Evaluates to true

        System.out.printf("Is Java fun? %b%n", isJavaFun);
        System.out.printf("Is fish a mammal? %b%n", isFishMammal);
        System.out.printf("Is the sun a star? %b%n", isSunStar);
        System.out.printf("Does 1 + 2 equal 3? %b%n", isSumCorrect);
    }

    /** (SEE 1C1 FOR MORE INFORMATION)
     * STRING DATA TYPES
     * Demonstrates char and String types with best practices
     */
    private static void demonstrateTextVariables() {
        System.out.println("\n=== TEXT TYPES ===");

        // Character type
        char firstLetter = 'A';
        char copyrightSymbol = '\u00A9';  // Unicode for ©

        // String types
        String greeting = "Hello Java";
        String redundantString = new String("Avoid this constructor");  // Not recommended

        // String comparison
        boolean areEqual = greeting.equalsIgnoreCase("hello java");

        // StringBuilder for mutable sequences
        StringBuilder builder = new StringBuilder("Efficient");
        builder.append(" string manipulation");

        System.out.printf("First letter: %c%n", firstLetter);
        System.out.printf("Copyright symbol: %c%n", copyrightSymbol);
        System.out.printf("Greeting: %s%n", greeting);
        System.out.printf("Strings equal (case insensitive)? %b%n", areEqual);
        System.out.printf("StringBuilder result: %s%n", builder.toString());
    }
}