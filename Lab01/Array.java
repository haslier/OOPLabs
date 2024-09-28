// 6.5
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = v.nextInt();

       
        int[] array = new int[n];

        
        System.out.println("Enter " + n + " numeric elements:");
        for (int i = 0; i < n; i++) {
            array[i] = v.nextInt();
        }

        
        Arrays.sort(array);

        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / n;

       
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}


