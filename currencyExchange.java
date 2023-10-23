import java.util.Scanner;

public class currencyExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount in BDT: ");
        float bdt = input.nextFloat();
        System.out.println("Enter exchange rate in USD: ");
        float usd = input.nextFloat();
        System.out.println("Enter exchange rate in CAD: ");
        float cad = input.nextFloat();

        float usd1 = bdt * usd;
        float cad1 = bdt * cad;

        System.out.println("USD: " + usd1 + "$");
        System.out.println("CAD: " + cad1 + "$");
    }
}
