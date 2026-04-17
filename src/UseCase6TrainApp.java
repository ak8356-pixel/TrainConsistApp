import java.util.HashMap;
import java.util.Map;

/**
 * =========================================================
 * MAIN CLASS - UseCase6TrainApp
 * =========================================================
 *
 * UC6: Bogie Capacity Mapping using HashMap
 *
 * @author Aradhya
 * @version 6.0
 */

public class UseCase6TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert values
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display using entrySet
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }
    }
}
