import java.util.Arrays;

public class Day11assignment2 {

    // Generic method to swap elements in an array
    public static <T> void swap(T[] array, int i, int j) {
        if (i != j && i >= 0 && i < array.length && j >= 0 && j < array.length) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // Example usage
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        swap(intArray, 0, 4);
        System.out.println(Arrays.toString(intArray)); // Output: [5, 2, 3, 4, 1]

        String[] strArray = {"apple", "banana", "cherry"};
        swap(strArray, 1, 2);
        System.out.println(Arrays.toString(strArray)); // Output: [apple, cherry, banana]
    }
}
