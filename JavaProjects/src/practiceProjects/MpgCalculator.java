import java.util.Scanner;

public class MpgCalculator {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter miles");
		int miles = userInput.nextInt();
				
		System.out.println("Enter gallons");
		int gallons = userInput.nextInt();
				
		double mpg = miles/gallons;
				
		System.out.println("you spent " + mpg + " gallons per mile");

	}

}
