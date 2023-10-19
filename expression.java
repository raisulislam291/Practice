import java.util.Scanner;

public class expression {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, a, b;
        System.out.println("Enter tha value of x: ");
        x = input.nextInt();
        System.out.println("Enter the value of y: ");
        y = input.nextInt();
        System.out.println("Enter the value of a: ");
        a = input.nextInt();
        System.out.println("Enter the value of b: ");
        b = input.nextInt();

        double result = (x - 5) / 2.0 + 2 * ((55 - y) / (double) a - (b + 9) / (double) y) / 2.5 + 42;

        System.out.println("result: " + result);
    }
}