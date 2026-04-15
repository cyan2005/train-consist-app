import java.util.*;
import java.util.stream.Collectors;

// 🔹 Bogie Class
class Bogie {
    private String type;

    public Bogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}

// 🔹 Main Class (public → file name must match)
public class TrainConsistApp {

    public static void main(String[] args) {

        // 🔹 Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper"));
        bogies.add(new Bogie("AC Chair"));
        bogies.add(new Bogie("Sleeper"));
        bogies.add(new Bogie("First Class"));
        bogies.add(new Bogie("AC Chair"));

        // 🔹 Group using Stream API
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        // 🔹 Print grouped result
        System.out.println("Grouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}