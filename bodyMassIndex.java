import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in KG: ");
        float w = input.nextFloat();
        System.out.println("Enter your height in meter: ");
        float h = input.nextFloat();

        float bmi = w / (h * h);
        if (bmi < 18.5) {
            System.out.println("Sorry! you are less than standard value. And your result is: " + bmi);
        } else if (bmi > 24.9) {
            System.out.println("Oops! you have more than standard BMI. And your result is: " + bmi);
        } else {
            System.out.println("CONGRATULATIONS!!! Your BMI is PERFECT AND IS's: " + bmi);
        }

    }
}
