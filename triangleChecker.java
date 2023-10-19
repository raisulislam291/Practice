import java.util.Scanner;

public class triangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of the second side: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of the third side: ");
        double side3 = scanner.nextDouble();

        boolean isValid = isTriangleValid(side1, side2, side3);

        if (isValid) {
            System.out.println("It is a valid triangle.");
        } else {
            System.out.println("It is not a valid triangle.");
        }
    }

    // Function to check the validity of a triangle
    public static boolean isTriangleValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}
