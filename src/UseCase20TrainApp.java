import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase20TrainApp
 * =========================================================
 *
 * UC20: Defensive Search using IllegalStateException
 *
 * @author Aradhya
 * @version 20.0
 */

public class UseCase20TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Bogie collection (try empty first)
        List<String> bogies = new ArrayList<>();

        // Uncomment below to test valid case
        // bogies.add("B101");
        // bogies.add("B205");

        try {
            searchBogie(bogies, "B101");
        } catch (IllegalStateException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }

    // Search method with defensive check
    public static void searchBogie(List<String> bogies, String key) {

        // Defensive Programming (Fail-Fast)
        if (bogies.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies.");
        }

        // Normal search logic
        for (String b : bogies) {
            if (b.equals(key)) {
                System.out.println("\nBogie Found: " + key);
                return;
            }
        }

        System.out.println("\nBogie NOT Found: " + key);
    }
}
