import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase7TrainApp
 * =========================================================
 *
 * UC7: Sort Bogies using Comparator based on Capacity
 *
 * @author Aradhya
 * @version 7.0
 */

// Custom Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " → Capacity: " + capacity);
    }
}

public class UseCase7TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Sort using Comparator (lambda)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("\nSorted Bogies (by Capacity):");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}
