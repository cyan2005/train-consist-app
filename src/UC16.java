import java.util.*;

public class UC16 {

    public static void main(String[] args) {

        // 🔹 Array of capacities
        int[] capacities = {72, 56, 24, 70, 60};

        int n = capacities.length;

        // 🔹 Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // 🔹 Print sorted array
        System.out.println("Sorted Capacities:");
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
    }
}