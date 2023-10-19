import java.util.Scanner;

public class equalityExercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        System.out.println("Enter third number: ");
        num3 = input.nextInt();
        System.out.println("Enter fourth number: ");
        num4 = input.nextInt();

        if (num1 == num2 && num1 == num3 && num1 == num4) {
            System.out.println("All are equal.");
        } else {
            System.out.println("Not equal.");
        }
    }
}
