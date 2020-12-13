import java.util.Scanner;

public class OddNums {

	private static Scanner userInput;

	public static void main(String[] args) {
		userInput = new Scanner(System.in);	

		int num1, num2;
		int counter = 0;

		System.out.println("Please enter a number");
		num1 = userInput.nextInt();
		System.out.println("Please enter another number");
		num2 = userInput.nextInt();

		if (num2 > num1) {
			if (num1 % 2 == 0) {
				num1 += 1;
			}

			while (num1 <= num2) {
				num1 += 2;
				counter++;
			}

			System.out.println(counter);

		} else {
			System.out.println("Second number should be greater than the first num");
		}

	}

}
