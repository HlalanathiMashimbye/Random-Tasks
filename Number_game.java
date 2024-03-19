import java.util.Scanner;

public class Number_game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        int totalRounds = 0;

        do {
            int maxAttempts = getMaxAttempts(scanner);
            totalRounds++;
            int roundScore = playGame(scanner, maxAttempts);
            totalScore += roundScore;
            System.out.println("Round " + totalRounds + " Score: " + roundScore);
            System.out.print("Play again? (y/n): ");
        } while (scanner.next().equalsIgnoreCase("y"));

        System.out.println("Thanks for playing! Your final score is " + totalScore);
        scanner.close();
    }

    public static int getMaxAttempts(Scanner scanner) {
        System.out.print("Enter the maximum number of attempts allowed: ");
        return scanner.nextInt();
    }

    public static int playGame(Scanner scanner, int maxAttempts) {
        int secretNumber = (int) (Math.random() * 100) + 1; // Generate random number between 1 and 100
        int attempts = 0;
        boolean won = false;

        System.out.println("****Welcome to the number guessing game!****");
        System.out.println("Try to guess a random number between 1 and 100. You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts && !won) {
            attempts++;
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            scanner.nextLine(); 

            if (guess == secretNumber) {
                won = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (!won) {
            System.out.println("Sorry, you ran out of attempts. The number was " + secretNumber + ".");
        }

        // Calculate score based on attempts 
        int score = maxAttempts - attempts + 1;
        return score;
    }
}
