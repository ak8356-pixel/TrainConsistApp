import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase1TrainApp
 * =========================================================
 *
 * UC1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This program initializes the Train Consist Management App
 * and displays the initial state of the train consist.
 *
 * @author Aradhya
 * @version 1.0
 */

public class UseCase1TrainApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        System.out.println("Program running...");
    }
}