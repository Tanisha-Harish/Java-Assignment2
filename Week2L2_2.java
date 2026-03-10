import java.util.Scanner;

public class Week2L2_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        double bonus = 0;

        // Logic: 5% bonus if service is MORE than 5 years
        if (years > 5) {
            bonus = salary * 0.05;
            System.out.println("Congratulations! Your bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus assigned. Years of service must be more than 5.");
        }

        input.close();
    }
}