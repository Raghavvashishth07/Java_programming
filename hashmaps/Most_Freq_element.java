package hashmaps;
import java.util.*;

public class Most_Freq_element {
    public static void main(String[] args) {
        // Array containing numbers
        int[] arr = {
            1, 2, 3, 2, 3, 4, 4, 4, 4, 4, 5, 6, 4, 6, 2,
            1, 1, 2, 3, 4, 5, 6, 7, 4, 8, 8, 8, 8, 8, 2, 2, 2, 2, 2
        };

        // Step 1: Create a frequency map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int e : arr) {
            // If element not in map, insert with value 1
            if (!freq.containsKey(e)) {
                freq.put(e, 1);
            } else {
                // Otherwise, increment its frequency
                freq.put(e, freq.get(e) + 1);
            }
        }

        // Print the frequency map
        System.out.println("Frequency map: ");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Step 2: Find the element with the maximum frequency
        int maxFreq = 0;
        int max_ele = -1;

        for (var el : freq.entrySet()) {
            if (el.getValue() > maxFreq) {
                maxFreq = el.getValue();
                max_ele = el.getKey();
            }
        }

        // Print the result
        System.out.println("\nMost frequent element: " + max_ele);
        System.out.println("Frequency: " + maxFreq);
    }
}
