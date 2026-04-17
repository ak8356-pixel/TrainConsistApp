/**
 * =========================================================
 * MAIN CLASS - UseCase16TrainApp
 * =========================================================
 *
 * UC16: Sort Bogie Capacities using Bubble Sort
 *
 * @author Aradhya
 * @version 16.0
 */

public class UseCase16TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of capacities
        int[] capacities = {72, 40, 60, 80, 50};

        System.out.println("\nOriginal Capacities:");
        printArray(capacities);

        // Bubble Sort
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Capacities:");
        printArray(capacities);
    }

    // Helper method
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}