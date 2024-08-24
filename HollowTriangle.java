public class HollowTriangle {
    public static void main(String[] args) { // Number of rows in the hollow triangle

        // Outer loop for number of rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop 1 for printing leading spaces
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            
            // Inner loop 2 for printing asterisks
            for (int k = 1; k <= (2 * i - 1); k++) {
                // Print asterisks only at the edges or corners of the triangle
                if (k == 1 || k == 2 * i - 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
