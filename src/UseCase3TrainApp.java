import java.util.HashSet;
import java.util.Set;

/**
 * =========================================================
 * MAIN CLASS - UseCase3TrainApp
 * =========================================================
 *
 * UC3: Ensure No Duplicate Bogie IDs using HashSet
 *
 * @author Aradhya
 * @version 3.0
 */

public class UseCase3TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieSet = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieSet.add("B1");
        bogieSet.add("B2");
        bogieSet.add("B3");
        bogieSet.add("B2"); // duplicate
        bogieSet.add("B1"); // duplicate

        // Display unique bogies
        System.out.println("\nUnique Bogie IDs:");
        for (String id : bogieSet) {
            System.out.println(id);
        }
    }
}
