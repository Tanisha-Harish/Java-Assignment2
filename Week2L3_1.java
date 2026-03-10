import java.util.Scanner;

public class Week2L3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        
        // Ensure the input is a valid integer
        if (input.hasNextInt()) {
            int year = input.nextInt();

            // Condition: The program only works for year >= 1582
            if (year < 1582) {
                System.out.println("The LeapYear program only works for year >= 1582.");
            } else {
                System.out.println("--- Part 1: Multiple if-else logic ---");
                // Rule: Divisible by 4 and not 100 unless divisible by 400
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else if (year % 100 == 0) {
                    System.out.println(year + " is not a Leap Year");
                } else if (year % 4 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is not a Leap Year");
                }

                System.out.println("\n--- Part 2: Single if statement with logical operators ---");
                // Combined Logic: (Divisible by 400) OR (Divisible by 4 AND NOT 100)
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is not a Leap Year");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a numerical year.");
        }

        input.close();
    }
}
    