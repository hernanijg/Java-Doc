package Fundamentals.ControlStructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/** (SEE 1E1 FOR MORE INFORMATION)
 * COMPREHENSIVE LOOP DEMONSTRATION
 *
 * Covers all loop types with practical examples:
 * - Standard for loops
 * - While/do-while loops
 * - Enhanced for-each loops
 * - Modern Stream API
 */
public class Loops {
    public static void main(String[] args) {
        showForLoops();
        showWhileLoops();
        showForEachLoops();
        showStreamOperations();
    }

    /** (SEE 1E3 FOR MORE INFORMATION)
     * TRADITIONAL FOR LOOPS
     * - Index-controlled iteration
     * - Full control over iteration parameters
     */
    private static void showForLoops() {
        System.out.println("\n=== STANDARD FOR LOOPS ===");

        // Basic incrementing loop
        // (SEE 1E5 FOR TAGS INFORMATION)
        tag:
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration #" + i);
        }

        // Complex control example
        for (int i = 0, j = 100; i < j; i += 10, j -= 10) {
            System.out.printf("i: %d, j: %d%n", i, j);
        }
    }

    /** (SEE 1E2 & 1E6 FOR MORE INFORMATION)
     * WHILE LOOPS
     * - Condition-first execution
     * - Best for unknown iteration counts
     */
    private static void showWhileLoops() {
        System.out.println("\n=== WHILE LOOPS ===");

        // Standard while
        int counter = 3;
        while (counter > 0) {
            System.out.println("Countdown: " + counter);
            counter--;
            // (SEE 1E4 FOR MORE INFORMATION)
            //break;
            //continuos;
        }

        // Do-while (guaranteed execution)
        System.out.println("\n=== DO-WHILE LOOPS ===");
        int value;
        do {
            value = (int) (Math.random() * 10);
            System.out.println("Sampled value: " + value);
        } while (value != 7);
    }

    /** (SEE 1E8 FOR MORE INFORMATION)
     * ENHANCED FOR LOOPS
     * - Collection/array iteration
     * - Readability-focused
     */
    private static void showForEachLoops() {
        System.out.println("\n=== ENHANCED FOR LOOPS ===");

        String[] colors = {"Red", "Green", "Blue"};

        for (String color : colors) {
            System.out.println("Color: " + color);
        }
    }

    /**
     * STREAM API (JAVA 8+)
     * - Functional-style iteration
     * - Enables method chaining
     */
    private static void showStreamOperations() {
        System.out.println("\n=== STREAM OPERATIONS ===");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Basic iteration
        numbers.stream()
                // (SEE 1E7 FOR FOREACH INFORMATION)
                .forEach(n -> System.out.println("Number: " + n));

        // Filtered pipeline
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .forEach(System.out::println);
    }

    /**
     * COMMON PITFALL EXAMPLE
     * Demonstrates proper collection modification during iteration
     */
    private static void showSafeModification() {
        System.out.println("\n=== SAFE ITERATION ===");
        List<String> items = new ArrayList<>(List.of("A", "B", "C"));
        // (SEE 1EE1 FOR MORE INFORMATION)
        // ❌ Dangerous (throws ConcurrentModificationException)
        // for (String s : items) {
        //     if (s.equals("B")) items.remove(s);
        // }

        // ✅ Safe approach using Iterator
        Iterator<String> iter = items.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals("B")) {
                iter.remove();
            }
        }
        System.out.println("Modified list: " + items);
    }
}
