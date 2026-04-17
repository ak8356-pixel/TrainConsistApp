import java.util.Arrays;

/**
 * =========================================================
 * MAIN CLASS - UseCase17TrainApp
 * =========================================================
 *
 * UC17: Sort Bogie Types using Arrays.sort()
 *
 * @author Aradhya
 * @version 17.0
 */

public class UseCase17TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie types
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "Cargo", "General"};

        // Display original
        System.out.println("\nOriginal Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));

        // Sort using built-in method
        Arrays.sort(bogieTypes);

        // Display sorted
        System.out.println("\nSorted Bogie Types (Alphabetical):");
        System.out.println(Arrays.toString(bogieTypes));
    }
}
