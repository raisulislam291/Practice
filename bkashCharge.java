import java.util.Scanner;

public class bkashCharge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your amount: ");
        float amount = input.nextFloat();

        double charge = (amount / 100) * 1.85;
        System.out.println("Charge is: "+ charge);
        // System.out.printf("%.2f\n", charge+ "KM/H");

    }
}
