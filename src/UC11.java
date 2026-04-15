import java.util.Scanner;
import java.util.regex.*;

// 🔹 Main Class
public class UC11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 Input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // 🔹 Regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // 🔹 Compile patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // 🔹 Match input
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        // 🔹 Validate
        if (m1.matches()) {
            System.out.println("Train ID is VALID ✅");
        } else {
            System.out.println("Train ID is INVALID ❌");
        }

        if (m2.matches()) {
            System.out.println("Cargo Code is VALID ✅");
        } else {
            System.out.println("Cargo Code is INVALID ❌");
        }

        sc.close();
    }
}