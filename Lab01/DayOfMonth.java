// 6.4
import java.util.Scanner;

public class DayOfMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String monthInput;
        int year;

        while (true) {
            
            System.out.print("Enter the month (full name, abbreviation, 3 letters, or number): ");
            monthInput = scanner.nextLine().trim();

            
            System.out.print("Enter the year (non-negative integer): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a non-negative integer for the year.");
                scanner.next();
            }
            year = scanner.nextInt();
            scanner.nextLine(); 

            
            int days = getDaysInMonth(monthInput, year);
            if (days != -1) {
                System.out.println("Number of days: " + days);
                break; 
            } else {
                System.out.println("Invalid month/year. Please try again.");
            }
        }

        scanner.close();
    }

    private static int getDaysInMonth(String month, int year) {
        
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        String[] monthAbbreviations = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        String[] monthShort = {
            "Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."
        };
        
        int[] commonYearDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapYearDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        
        if (year < 0) {
            return -1; 
        }

        
        month = month.toLowerCase();
        int monthIndex = -1;

        
        for (int i = 0; i < months.length; i++) {
            if (month.equals(months[i].toLowerCase()) || 
                month.equals(monthAbbreviations[i].toLowerCase()) || 
                month.equals(monthShort[i].toLowerCase()) || 
                month.equals(String.valueOf(i + 1))) {
                monthIndex = i;
                break;
            }
        }

        // If month is invalid, return -1
        if (monthIndex == -1) {
            return -1; // Invalid month
        }

        // Determine if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Return the number of days
        return isLeapYear ? leapYearDays[monthIndex] : commonYearDays[monthIndex];
    }
}

