import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
//something

public class Main {
    public static void main(String[] args) {
        //Introduction Method
        System.out.println("Hello! What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        //computerNumberMethod
        boolean play = true;
        while (play) {
            Random number = new Random();
            int upperbound = 21;
            int int_random = number.nextInt(upperbound);

            //roundSetupMethod
            int rounds = 6;

            //Start Guessing Method

            System.out.println("Well " + name + ", I am thinking of a number between 1 and 20");
            for (int roundStart = 1; roundStart <= rounds; roundStart++) {
                System.out.println("Round " + roundStart);
                System.out.println("Take a guess");
                int guess = scanner.nextInt();
                if (guess > int_random) {
                    System.out.println("Too high! Try again");
                } else if (guess < int_random) {
                    System.out.println("Too low! Try again");
                } else if (roundStart > rounds) {
                    System.out.println("Sorry! You lost!");
                } else if (guess == int_random) {
                    System.out.println("Good job, " + name + "! You guessed my number in " + roundStart + " guesses!");
                    break;
                }
            }
            //Replay Method

            System.out.println("Would you like to play again? (y or n)");
            String replay = scanner.nextLine();
            String y = "y";
            if (replay != y) {
                System.out.println("Game over! Thanks for playing!");
                System.exit(0);
            } else if (replay == y) {
                play = true;
            }
        }
    }
}

