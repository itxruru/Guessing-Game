import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int numberOfTries = 0;
        int userGuess = 0;
        boolean win = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (!win) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please guess a number between 1 and 100.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                win = true;
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}