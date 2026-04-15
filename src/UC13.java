import java.util.*;
import java.util.stream.*;

class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + "(" + capacity + ")";
    }
}

public class UC13 {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        // 🔹 Create sample data
        for (int i = 0; i < 1000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 50));
        }

        // 🔹 LOOP METHOD
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();

        // 🔹 STREAM METHOD
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();

        // 🔹 Output
        System.out.println("Loop Time: " + (endLoop - startLoop) + " ns");
        System.out.println("Stream Time: " + (endStream - startStream) + " ns");

        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());
    }
}