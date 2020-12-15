import java.util.Scanner;

public class guessingGame {

	public static void main(String[] args) {

		try (Scanner userInput = new Scanner(System.in)) {
			String winner = "Spain";
			String answer = "";
			int counter = 0;
			int guessLimit = 3;
			boolean limitReached = false;

			while (!winner.equalsIgnoreCase(answer) && !limitReached) {
				if (counter < guessLimit) {
					System.out.println("Which country won the 2010 Football World Cup? \nYou are limited to 3 answers");
					answer = userInput.next();
					counter++;
				}

				else {
					limitReached = true;
				}
			}

			if (limitReached) {
				System.out.println("You lost! You reached your limit");
			} else {
				System.out.println("You won!");
			}
		}

	}

}
