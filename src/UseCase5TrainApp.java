import java.util.LinkedHashSet;
import java.util.Set;

/**
 * =========================================================
 * MAIN CLASS - UseCase5TrainApp
 * =========================================================
 *
 * UC5: Maintain Insertion Order with Uniqueness
 *
 * @author Aradhya
 * @version 5.0
 */

public class UseCase5TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet
        Set<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper"); // duplicate

        // Display formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);
    }
}
