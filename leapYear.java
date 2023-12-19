import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        // // boolean isLeapYear = (year%4 ==0 && year % 100 ==0) ;
        // if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        // System.out.println(year + " is a leap year");
        // } else {
        // System.out.println(year + " is not a leap year.");
        // }

        // OR
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It's a leap year.");
                } else {
                    System.out.println("It's not a leap year.");
                }
            } else {
                System.out.println("It's a leap year.");
            }
        } else {
            System.out.println("It's not a leap year.");

        }
    }
}
