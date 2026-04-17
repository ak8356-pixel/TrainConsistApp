import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase12TrainApp
 * =========================================================
 *
 * UC12: Safety Validation using Functional Interfaces
 *
 * @author Aradhya
 * @version 12.0
 */

// Bogie class
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UseCase12TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Safety Validation System ===");

        // Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Flat", "Steel"));

        // Safety validation using allMatch()
        boolean isSafe = bogies.stream().allMatch(b -> {
            // Rule: Cylindrical bogies must carry Petroleum only
            if (b.type.equals("Cylindrical")) {
                return b.cargo.equals("Petroleum");
            }
            return true;
        });

        // Output result
        if (isSafe) {
            System.out.println("\nTrain is SAFE for operation.");
        } else {
            System.out.println("\nTrain is NOT SAFE!");
        }
    }
}
