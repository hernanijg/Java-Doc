package Fundamentals.ControlStructures;

/** (SEE 1D1 FOR MORE INFORMATION)
 * CONDITIONAL STRUCTURES DEMONSTRATION
 *
 * This class showcases different conditional structures in Java:
 * - Ternary operator
 * - If-else statements
 * - Switch statements
 *
 * Best practices and common patterns are included.
 */
public class Conditional {
    public static void main(String[] args) {
        demonstrateTernaryOperator();
        demonstrateIfElseStructure();
        demonstrateSwitchStatement();
    }

    /** (SEE 1D2 FOR MORE INFORMATION)
     * TERNARY OPERATOR DEMONSTRATION
     * Shows compact conditional assignment syntax.
     */
    private static void demonstrateTernaryOperator() {
        System.out.println("\n=== TERNARY OPERATOR ===");

        boolean isAuthenticated = true;
        String authStatus = isAuthenticated ? "User authenticated" : "Access denied";

        System.out.println("Authentication Status: " + authStatus);

        // Nested ternary example (use with caution)
        int userLevel = 3;
        String accessLevel = userLevel > 5 ? "Admin" :
                (userLevel > 2 ? "Moderator" : "Regular");
        System.out.println("Access Level: " + accessLevel);
    }

    /** (SEE 1D3 FOR MORE INFORMATION)
     * IF-ELSE STRUCTURE DEMONSTRATION
     * Shows different branching scenarios with best practices.
     */
    private static void demonstrateIfElseStructure() {
        System.out.println("\n=== IF-ELSE STRUCTURE ===");

        boolean hasSubscription = true;
        boolean isTrialActive = false;
        int usageCount = 42;

        // Basic if-else
        if (hasSubscription && !isTrialActive) {
            System.out.println("Full access granted");
        }
        else if (hasSubscription || isTrialActive) {
            System.out.println("Trial or partial access");
        }
        else {
            System.out.println("Please subscribe");
        }

        // Guard clause pattern
        if (usageCount <= 0) {
            System.out.println("No usage detected");
            return;
        }

        if (usageCount > 100) {
            System.out.println("High usage warning");
        }
    }

    /** (SEE 1D4 FOR MORE INFORMATION)
     * SWITCH STATEMENT DEMONSTRATION
     * Shows traditional and enhanced switch features (Java 14+).
     */
    private static void demonstrateSwitchStatement() {
        System.out.println("\n=== SWITCH STATEMENT ===");

        int dayOfWeek = 3;
        String dayType;

        // Traditional switch
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid day";
        }
        System.out.println("Day type (traditional): " + dayType);

        // Switch expression (Java 14+) (SEE 1D5 FOR MORE INFORMATION)
        dayType = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> {
                System.err.println("Warning: Invalid day provided");
                yield "Unknown";
            }
        };
        System.out.println("Day type (modern): " + dayType);
    }
}