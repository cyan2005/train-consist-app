import java.util.*;

public class UC18 {

    public static void main(String[] args) {

        // 🔹 Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 🔹 Search key
        String searchKey = "BG309";

        boolean found = false;

        // 🔹 Linear Search
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // stop early
            }
        }

        // 🔹 Output
        if (found) {
            System.out.println("Bogie ID FOUND ✅");
        } else {
            System.out.println("Bogie ID NOT FOUND ❌");
        }
    }
}