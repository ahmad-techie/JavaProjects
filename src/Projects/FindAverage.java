package Projects;
import java.util.Scanner;

public class FindAverage {
	public static void main(String[] args) {
		try (
		Scanner input = new Scanner(System.in)) {
			int counter = 0;
			int number = 0;
			int total = 0;
			double average = 0;
			
			System.out.println("Enter a number");
			number = input.nextInt();
			
			while(number != -1) {
				counter++;
				total += number;
				
				if(counter<2) {
					System.out.println("Enter another number");
					number = input.nextInt();
				}
				else {
					System.out.println("Enter another number or press -1 to finish");
					number = input.nextInt();
				}
				
			}
			
			
			if(number == -1) {
				average = (double) total / counter;
				System.out.println("The average of numbers you entered is: " + average);
			}
			else {
				System.out.println("Please enter a number");
			}
		}
	}

}
