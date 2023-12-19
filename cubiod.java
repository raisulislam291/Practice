import java.util.Scanner;

public class cubiod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of length: ");
        float length = input.nextFloat();
        System.out.println("Enter the value of width: ");
        float width = input.nextFloat();
        System.out.println("Enter the value of height: ");
        float height = input.nextFloat();

        float volume, totalArea;
        totalArea = 2 * (length * width + length * height + width * height);
        volume = length * width * height;

        System.out.println(totalArea);
        System.out.println(volume);
    }
}