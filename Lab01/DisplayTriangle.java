// 6.3
import java.util.Scanner;

public class DisplayTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the height of the triangle (n): ");
        int n = scanner.nextInt();

        // Display the triangle
        displayTriangle(n);
    }

    // Method to display the triangle
    public static void displayTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}