package Practice;

import java.util.Scanner;

public class divisibleExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 2 and 5.");
        } else {
            System.out.println(number + " is not divisible by both 2 and 5.");
        }
    }
}
