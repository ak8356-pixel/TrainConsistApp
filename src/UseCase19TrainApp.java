import java.util.Arrays;
import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase19TrainApp
 * =========================================================
 *
 * UC19: Binary Search for Bogie ID
 *
 * @author Aradhya
 * @version 19.0
 */

public class UseCase19TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sorted array of bogie IDs
        String[] bogieIds = {"B101", "B205", "B309", "B410", "B512"};

        // Ensure sorted (safe practice)
        Arrays.sort(bogieIds);

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1;  // search right
            }
        }

        // Output
        if (found) {
            System.out.println("\nBogie ID FOUND using Binary Search.");
        } else {
            System.out.println("\nBogie ID NOT FOUND.");
        }

        sc.close();
    }
}
