package Projects;
import java.text.NumberFormat;
import java.util.Scanner;
/**
 * This basic program calculates the mortgage on yearly basis. 
 * @author Ahmad
 *
 */

//Mortgage calculator formula: Payment = P x (r / n) x (1 + r / n)^n(t)] / (1 + r / n)^n(t) - 1

public class MortgageCalculator {

	public static void main(String[] args) {
		
		mortgageCalculator();
		
	}
	
	static void mortgageCalculator() {
		try (Scanner userInput = new Scanner(System.in)) {
			System.out.println("How much is the principle amount?");
			int principleAmount = userInput.nextInt();
			
			System.out.println("How long is the term in years?");
			byte term = userInput.nextByte();
			
			System.out.println("How much is the interest rate?");
			double interestRate = userInput.nextFloat() / 100;
			
			byte numberOfMonths = 12;
			int n = term * numberOfMonths;
			double r = interestRate/numberOfMonths;
			
			double mortgage = principleAmount 
					*(r*Math.pow(1+r, n))
					/(Math.pow(1+r, n)-1);
			String monthlyPayment = NumberFormat.getCurrencyInstance().format(mortgage);
			System.out.println("Your monthy payment is: " + monthlyPayment);
		}
	}

}
