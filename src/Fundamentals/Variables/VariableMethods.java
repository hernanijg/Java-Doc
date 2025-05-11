package Fundamentals.Variables;

public class VariableMethods {
    public static void main(String[] args) {
        /**
         * DEMONSTRATING STRING METHODS IN JAVA
         *
         * This example shows common String operations with clear examples.
         * Reference: Java Documentation (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html)
         */
        // Sample strings for demonstration
        String singleName = "Jhon Doe";
        String sentence = "Jhon Doe created the program universe";

        // 1. BASIC STRING OPERATIONS (1C5)
        System.out.println("\n=== BASIC STRING OPERATIONS ===");
        System.out.printf("%-30s: %d%n", "singleName.length()", singleName.length());
        System.out.printf("%-30s: %s%n", "singleName.toLowerCase()", singleName.toLowerCase());
        System.out.printf("%-30s: %s%n", "singleName.toUpperCase()", singleName.toUpperCase());
        System.out.printf("%-30s: %s%n", "   trim example   ".trim(), "   trim example   ".trim());

        // 2. STRING COMPARISON (1C6)
        System.out.println("\n=== STRING COMPARISON ===");
        System.out.printf("%-30s: %b%n", "singleName.equals(\"Jhon Doe\")", singleName.equals("Jhon Doe"));
        System.out.printf("%-30s: %b%n", "singleName.equalsIgnoreCase(\"jhon doe\")",
                singleName.equalsIgnoreCase("jhon doe"));
        System.out.printf("%-30s: %d%n", "singleName.compareTo(\"Jhon Doe\")",
                singleName.compareTo("Jhon Doe"));  // Lexicographical order (0 means equal)

        // 3. CHARACTER AND SUBSTRING EXTRACTION (1C7)
        System.out.println("\n=== CHARACTER EXTRACTION ===");
        System.out.printf("%-30s: %c%n", "singleName.charAt(0)", singleName.charAt(0));
        System.out.printf("%-30s: %s%n", "singleName.substring(2)", singleName.substring(2));
        System.out.printf("%-30s: %s%n", "singleName.substring(2, 5)", singleName.substring(2, 5));
        System.out.printf("%-30s: %s%n", "singleName.substring(length-1)",
                singleName.substring(singleName.length()-1));

        // 4. STRING MANIPULATION (1C8)
        System.out.println("\n=== STRING MANIPULATION ===");
        System.out.printf("%-30s: %s%n", "sentence.replace(\"o\", \"O\")", sentence.replace("o", "O"));

        // 5. SEARCH OPERATIONS (1C9)
        System.out.println("\n=== SEARCH OPERATIONS ===");
        System.out.printf("%-30s: %d%n", "sentence.indexOf(\"un\")", sentence.indexOf("un"));  // First occurrence
        System.out.printf("%-30s: %d%n", "sentence.lastIndexOf(\"o\")", sentence.lastIndexOf("o"));  // Last occurrence
        System.out.printf("%-30s: %d%n", "sentence.indexOf('z')", sentence.indexOf("z"));  // -1 means not found
        System.out.printf("%-30s: %b%n", "sentence.contains(\"z\")", sentence.contains("z"));  // Boolean check

        // 6. PREFIX/SUFFIX CHECKING
        System.out.println("\n=== PREFIX/SUFFIX CHECKING ===");
        System.out.printf("%-30s: %b%n", "sentence.startsWith(\"Jhon\")", sentence.startsWith("Jhon"));
        System.out.printf("%-30s: %b%n", "sentence.endsWith(\"<>\")", sentence.endsWith("<>"));
    }
}
