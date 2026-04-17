import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase15TrainApp
 * =========================================================
 *
 * UC15: Safe Cargo Assignment with Runtime Exception Handling
 *
 * @author Aradhya
 * @version 15.0
 */

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogieUC15 {
    String shape;
    String cargo;

    public GoodsBogieUC15(String shape, String cargo) {
        this.shape = shape;
        this.cargo = cargo;
    }
}

// Service class for assignment
class CargoService {

    public static void assignCargo(GoodsBogieUC15 bogie) {

        try {
            // Rule: Rectangular bogie cannot carry Petroleum
            if (bogie.shape.equals("Rectangular") && bogie.cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum in Rectangular bogie");
            }

            System.out.println("Cargo assigned safely: " + bogie.cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.\n");
        }
    }
}

public class UseCase15TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Cargo Safety System ===");

        List<GoodsBogieUC15> bogies = new ArrayList<>();

        bogies.add(new GoodsBogieUC15("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogieUC15("Rectangular", "Coal"));     // valid
        bogies.add(new GoodsBogieUC15("Rectangular", "Petroleum")); // invalid

        // Process all bogies
        for (GoodsBogieUC15 b : bogies) {
            CargoService.assignCargo(b);
        }

        System.out.println("System continues safely...");
    }
}