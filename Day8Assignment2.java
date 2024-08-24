import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day8Assignment2 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob", "Alice", "David", "Charlie");

        // Create a HashMap to store name frequencies
        Map<String, Integer> nameCount = new HashMap<>();

        // Count occurrences of each name
        for (String name : names) {
            if (nameCount.containsKey(name)) {
                // If name already exists in map, increment its count
                nameCount.put(name, nameCount.get(name) + 1);
            } else {
                // If name is encountered for the first time, add it to map with count 1
                nameCount.put(name, 1);
            }
        }

        // Print the occurrences of each name
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
