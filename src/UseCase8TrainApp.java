import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =========================================================
 * MAIN CLASS - UseCase8TrainApp
 * =========================================================
 *
 * UC8: Filter Bogies using Stream API
 *
 * @author Aradhya
 * @version 8.0
 */

// Reusing Bogie class
class BogieUC8 {
    String name;
    int capacity;

    public BogieUC8(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " → Capacity: " + capacity);
    }
}

public class UseCase8TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<BogieUC8> bogies = new ArrayList<>();

        bogies.add(new BogieUC8("Sleeper", 72));
        bogies.add(new BogieUC8("AC Chair", 60));
        bogies.add(new BogieUC8("First Class", 40));
        bogies.add(new BogieUC8("Luxury", 80));

        // Stream filtering
        List<BogieUC8> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (capacity > 60):");
        for (BogieUC8 b : filtered) {
            b.display();
        }
    }
}
