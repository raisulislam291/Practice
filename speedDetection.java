import java.util.Scanner;

public class speedDetection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your distance(in meters): ");
        double distance = input.nextFloat();
        System.out.println("Enter your time(in minits): ");
        double time = input.nextFloat();

        double speed = distance / time;
        double speedInKmph = (speed / 16.667);
        String formatetedNumber = String.format("%.2f", speedInKmph);
        System.out.println(formatetedNumber + " KM/H");
        // System.out.printf("%.2f\n", speedInKmph+ "KM/H");
    }
}
