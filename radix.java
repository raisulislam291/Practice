import java.util.Scanner;

public class radix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String number = input.nextLine();

        if (number.matches("[01]+")) {
            System.out.println("Binary Radix = 2");
        } else if (number.matches("[0-7]+")) {
            System.out.println("Octal Radix = 8");
        } else if (number.matches("[0-9]+")) {
            System.out.println("Decimal Radix = 10");
        } else if (number.matches("[0-9A-F]+")) {
            System.out.println("Hexadecimal Radix = 16");
        } else {

            System.out.println("Not a number");
        }
    }
}
