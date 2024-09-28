// 2.2.6
import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter coefficient a (for ax + b = 0): ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        // Check if 'a' is zero
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinitely many solutions.");
            } else {
                System.out.println("The equation has no solution.");
            }
        } else {
            
            double x = -b / a;
            System.out.printf("The solution is: x = %.2f%n", x);
        }

        
        scanner.close();
    }
}

