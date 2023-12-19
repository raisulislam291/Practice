import java.util.Scanner;
import java.lang.*;;

public class areaOfTriangle {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;
        float s;
        System.out.println("Enter the sides value of triangle: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        s=(a+b+c)/2f;

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println(area);

    }
    
}
