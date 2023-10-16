import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;

        double meter;

        System.out.println("Please enter the number of meters");
        do {
            if (scan.hasNextDouble()) {
                meter = scan.nextDouble();
                if (meter > 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        // Calculations
        double metersToMiles = meter * METERS_TO_MILES;
        double metersToFeet = meter * METERS_TO_FEET;
        double metersToInches = meter * METERS_TO_INCHES;

        // Outputs
        System.out.printf("%-8s %.2f", "Meters:", meter);
        System.out.printf("\n%-7s %.2f", "Inches:", metersToInches);
        System.out.printf("\n%-5s %.2f", "Feet:", metersToFeet);
        System.out.printf("\n%-6s %.2f", "Miles:", metersToMiles);

    }
}