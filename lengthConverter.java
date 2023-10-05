package Practice;

import java.util.Scanner;

public class lengthConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length in inch: ");
        double inch = input.nextDouble();
        double meter = inch * 0.0254;
        System.out.println(inch + " inch is " + meter + " meter");
    }
}
