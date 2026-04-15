import java.util.*;

public class UC20 {

    public static void main(String[] args) {

        List<String> bogieIds = new ArrayList<>();

        // 🔹 Try searching
        try {
            searchBogie(bogieIds, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 🔹 Search method with validation
    public static void searchBogie(List<String> bogies, String key) {

        // ❌ Fail-fast check
        if (bogies.isEmpty()) {
            throw new IllegalStateException("No bogies available to search");
        }

        // 🔹 Normal search (linear)
        for (String id : bogies) {
            if (id.equals(key)) {
                System.out.println("Bogie FOUND ✅");
                return;
            }
        }

        System.out.println("Bogie NOT FOUND ❌");
    }
}