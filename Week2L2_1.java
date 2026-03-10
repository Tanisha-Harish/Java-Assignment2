import java.util.Scanner;

public class Week2L2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (input.hasNextInt()) {
            int number = input.nextInt();

            // Check if it's a Natural Number (positive integer)
            if (number >= 1) {
                for (int i = 1; i <= number; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " is an even number");
                    } else {
                        System.out.println(i + " is an odd number");
                    }
                }
            } else {
                System.out.println("Please enter a natural number (1 or greater).");
            }
        }
        input.close();
    }
}