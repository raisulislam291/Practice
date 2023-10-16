package Practice;

import java.util.Scanner;

public class percentageCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your bangla marks: ");
        float bangla = input.nextInt();
        System.out.println("Enter the marks of english: ");
        float english = input.nextInt();
        System.out.println("Enter your math marks: ");
        float math = input.nextInt();
        System.out.println("Enter your since marks: ");
        float science = input.nextInt();
        System.out.println("Enter your social marks: ");
        float social = input.nextInt();

        float average = (bangla + english + math + science + social) / 5;
        System.out.println("Your have got : " + average + "% marks");
    }
}
