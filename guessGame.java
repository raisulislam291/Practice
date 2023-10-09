
import java.util.Scanner;

public class guessGame {
    public static void main(String[] args) {
        int number = 15;
        Scanner input=new Scanner(System.in);
        System.out.println("Guess a number: ");
        int guess =input.nextInt();

        if(guess==number){
            System.out.println("""
                Congratulation!
                You gussed the number correctly.
            """);
        }else if (number>guess){
            System.out.println("The number is greater than "+ guess);
        }else{
            System.out.println("The number is smaller than " + guess);
    }
    }
}
