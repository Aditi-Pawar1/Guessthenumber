import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        boolean win = false;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Use try-with-resources to ensure the Scanner is closed properly
        try (Scanner input = new Scanner(System.in)) {
            while (!win) {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt();
                numberOfTries++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid guess. Please enter a number between 1 and 100.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    win = true;
                    System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
                }
            }
        }
    }
}
