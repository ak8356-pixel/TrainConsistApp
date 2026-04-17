import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * =========================================================
 * MAIN CLASS - UseCase11TrainApp
 * =========================================================
 *
 * UC11: Validate Train ID and Cargo Code using Regex
 *
 * @author Aradhya
 * @version 11.0
 */

public class UseCase11TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("\nEnter Train ID (format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // Regex patterns
        String trainPatternStr = "TRN-\\d{4}";
        String cargoPatternStr = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainPatternStr);
        Pattern cargoPattern = Pattern.compile(cargoPatternStr);

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Output results
        if (isTrainValid) {
            System.out.println("\nTrain ID is VALID");
        } else {
            System.out.println("\nTrain ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        sc.close();
    }
}
