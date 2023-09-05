//Task 1 : Number guessing game
import java.util.Random;
import java.util.Scanner;

public class index1 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNum = rand.nextInt(100) + 1;

        int tryCount = 0;
        while (true) {
            System.out.println("Enter your Number (1-100) : ");

            int PlayerGuess = sc.nextInt();
            tryCount++;

            if (PlayerGuess == randomNum) {
                System.out.println("Correct Guessing! You are the Winner!");
                System.out.println("It took you" + " " + tryCount + " " + "tries.");
                break;
            } else if (randomNum > PlayerGuess) {
                System.out.println("No! The number is higher Number");
            } else {
                System.out.println("No! The number is lower.Try Again.");
            }
        }
        sc.close();
    }
}