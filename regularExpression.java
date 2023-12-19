import java.util.Scanner;

public class regularExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Gmail: ");
        String str = input.nextLine();
        // String str = "programmer@gmail.com";

        int i = str.indexOf("@");
        String userName= str.substring(0, i);
        String domain = str.substring(i+1, str.length());

        System.out.println("Username: "+userName);
        System.out.println("Domain: "+ domain);

        System.out.println(domain.startsWith("gmail"));
    }
}
