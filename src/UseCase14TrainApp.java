import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase14TrainApp
 * =========================================================
 *
 * UC14: Custom Exception for Capacity Validation
 *
 * @author Aradhya
 * @version 14.0
 */

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie class
class PassengerBogie {
    String name;
    int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {

        // Fail-fast validation
        if (capacity <= 0) {
            throw new InvalidCapacityException(
                    "Invalid capacity for " + name + ". Must be > 0.");
        }

        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " → Capacity: " + capacity);
    }
}

public class UseCase14TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<PassengerBogie> train = new ArrayList<>();

        try {
            // Valid bogie
            train.add(new PassengerBogie("Sleeper", 72));

            // Invalid bogie (will throw exception)
            train.add(new PassengerBogie("AC Chair", 0));

            // This line won't execute if exception occurs above
            train.add(new PassengerBogie("First Class", 40));

        } catch (InvalidCapacityException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies in Train:");
        for (PassengerBogie b : train) {
            b.display();
        }
    }
}
