import java.util.*;
import java.util.stream.Collectors;

/**
 * =========================================================
 * MAIN CLASS - UseCase9TrainApp
 * =========================================================
 *
 * UC9: Group Bogies using Stream Collectors
 *
 * @author Aradhya
 * @version 9.0
 */

// Bogie class with category
class BogieUC9 {
    String name;
    int capacity;
    String category;

    public BogieUC9(String name, int capacity, String category) {
        this.name = name;
        this.capacity = capacity;
        this.category = category;
    }

    public String toString() {
        return name + "(" + capacity + ")";
    }
}

public class UseCase9TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list
        List<BogieUC9> bogies = new ArrayList<>();

        bogies.add(new BogieUC9("Sleeper", 72, "Passenger"));
        bogies.add(new BogieUC9("AC Chair", 60, "Passenger"));
        bogies.add(new BogieUC9("First Class", 40, "Passenger"));
        bogies.add(new BogieUC9("Cargo", 100, "Goods"));
        bogies.add(new BogieUC9("Parcel", 80, "Goods"));

        // Group using Stream
        Map<String, List<BogieUC9>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.category));

        // Display grouped result
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<BogieUC9>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
