package Pattern_Printing;

public class pattern_6 {

        public static void main(String[] args) {

            int n = 6;

            // Upper Half
            for (int i = 0; i < n; i++) {

                // Leading spaces
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }

                // First star
                System.out.print("*");

                // Middle spaces and second star
                if (i != 0) {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                System.out.println();
            }

            // Lower Half
            for (int i = n - 2; i >= 0; i--) {

                // Leading spaces
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }

                // First star
                System.out.print("*");

                // Middle spaces and second star
                if (i != 0) {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
