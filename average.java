import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        System.out.println("Enter third number: ");
        num3 = input.nextInt();
        System.out.println("Enter fourth number: ");
        num4 = input.nextInt();
        System.out.println("Enter fifth number: ");
        num5 = input.nextInt();

       int avg = (num1+num2+num3+num4+num5)/5;
       System.out.println(avg);
    }
}
