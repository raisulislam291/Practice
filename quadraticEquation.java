import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        System.out.println("Enter the value of b: ");
        int b = input.nextInt();
        System.out.println("Enter the value of c: ");
        int c = input.nextInt();

        double determinent = b * b - 4.0 * a * c;
        if (determinent > 0.0) {
            double root1 = (-b + Math.sqrt(determinent)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(determinent)) / (2.0 * a);
            System.out.println("The roots are " + root1 + "and " + root2);
        } else if (determinent == 0.0) {
            double root = -b / (2.0 * a);
            System.out.println("The root is " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
