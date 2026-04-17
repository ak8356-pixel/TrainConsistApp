import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =========================================================
 * MAIN CLASS - UseCase13TrainApp
 * =========================================================
 *
 * UC13: Performance Comparison (Loop vs Stream)
 *
 * @author Aradhya
 * @version 13.0
 */

// Bogie class
class BogieUC13 {
    String name;
    int capacity;

    public BogieUC13(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase13TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Performance Comparison ===");

        // Create large dataset
        List<BogieUC13> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new BogieUC13("Bogie" + i, i % 100));
        }

        // ---------------- LOOP METHOD ----------------
        long startLoop = System.nanoTime();

        List<BogieUC13> loopResult = new ArrayList<>();
        for (BogieUC13 b : bogies) {
            if (b.capacity > 50) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM METHOD ----------------
        long startStream = System.nanoTime();

        List<BogieUC13> streamResult = bogies.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- OUTPUT ----------------
        System.out.println("\nLoop Execution Time: " + loopTime + " ns");
        System.out.println("Stream Execution Time: " + streamTime + " ns");
    }
}