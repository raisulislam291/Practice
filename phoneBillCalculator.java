import java.util.Scanner;

public class phoneBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your monthly usage: ");
        int minutes = scanner.nextInt();

        double monthlyCharge = 125.0;
        double perMinuteCharge = 0.25;
        double perMinuteChargeAfter1000 = 0.49;
        int freeMinutes = 500;
        int highRateThreshold = 1000;

        double bill = monthlyCharge;

        if (minutes > freeMinutes) {
            if (minutes <= highRateThreshold) {
                bill += (minutes - freeMinutes) * perMinuteCharge;
            } else {
                bill += (highRateThreshold - freeMinutes) * perMinuteCharge;
                bill += (minutes - highRateThreshold) * perMinuteChargeAfter1000;
            }
        }

        System.out.println("Monthly bill " + bill + " Taka");
    }
}
