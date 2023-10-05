package Practice;

import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        double celsius = input.nextDouble();
        double farenhight = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in farenhight is: " + farenhight);
    }
}
