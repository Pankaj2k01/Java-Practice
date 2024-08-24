public class patterns {
    public static void main(String[] args) {
        // right angled triangle
        /*
         * 
         * *
         * * *
         * * * *
         * * * * *
         */

        // Code:- (nested for loop)
        // 5 -> no of columns
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* "); // print *
            }
            System.out.println(); // move to the new line
        }

        // TODO: print the inverted triangle
        /*
         * * * * *
         * * * *
         * * *
         * *
         * 
         */
        for (int i = 5; i>= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("* "); // print *
            }
            System.out.println(); // move to the new line
        }
        // TODO: print the triangle
        /*
              *
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *  
         */
        for (int i = 1; i<= 5; i++) {
            for (int j = 5-i ; j > 0; j--) {
                System.out.print(" "); // print *
            }
            for (int k = 1; k <= 2*i-1; k++){
                System.out.print("* "); // print *
            }
            System.out.println(); // move to the new line
        }
    }
}
