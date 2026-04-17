import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase10TrainApp
 * =========================================================
 *
 * UC10: Aggregate Seating Capacity using Stream Reduction
 *
 * @author Aradhya
 * @version 10.0
 */

// Reusing Bogie class
class BogieUC10 {
    String name;
    int capacity;

    public BogieUC10(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase10TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list
        List<BogieUC10> bogies = new ArrayList<>();

        bogies.add(new BogieUC10("Sleeper", 72));
        bogies.add(new BogieUC10("AC Chair", 60));
        bogies.add(new BogieUC10("First Class", 40));
        bogies.add(new BogieUC10("Luxury", 80));

        // Stream aggregation
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);
    }
}