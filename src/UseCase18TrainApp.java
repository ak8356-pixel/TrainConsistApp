import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase18TrainApp
 * =========================================================
 *
 * UC18: Linear Search for Bogie ID
 *
 * @author Aradhya
 * @version 18.0
 */

public class UseCase18TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIds = {"B101", "B205", "B309", "B410", "B512"};

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break; // early termination
            }
        }

        // Output result
        if (found) {
            System.out.println("\nBogie ID FOUND in the train.");
        } else {
            System.out.println("\nBogie ID NOT FOUND.");
        }

        sc.close();
    }
}