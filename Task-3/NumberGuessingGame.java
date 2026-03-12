import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Too low! Try again.");
            }
            else if (guess > number) {
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}