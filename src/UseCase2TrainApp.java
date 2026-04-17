import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase2TrainApp
 * =========================================================
 *
 * UC2: Dynamic Insertion and Removal of Passenger Bogies
 *
 * @author Aradhya
 * @version 2.0
 */

public class UseCase2TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList
        List<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display after insertion
        System.out.println("\nBogies after addition:");
        System.out.println(bogies);

        // Remove a bogie
        bogies.remove("AC Chair");

        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(bogies);

        // Check existence
        if (bogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(bogies);
    }
}
