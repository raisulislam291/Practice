package Practice;

import java.util.Scanner;

public class equalityExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int first = input.nextInt();
        System.out.println("Enter your second number: ");
        int second = input.nextInt();

        if (first > second) {
            System.out.println(first + " is greater than " + second);
        } else {
            System.out.println(second + " is greater than " + first);
        }

    }
}
