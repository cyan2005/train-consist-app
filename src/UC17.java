import java.util.*;

public class UC17 {

    public static void main(String[] args) {

        // 🔹 Array of bogie names
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // 🔹 Sort using Arrays.sort()
        Arrays.sort(bogies);

        // 🔹 Print sorted array
        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogies));
    }
}