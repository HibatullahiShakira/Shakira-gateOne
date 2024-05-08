import java.util.Scanner;
	public class TaskTwo {
	
		public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
	
		int sum = 0;
		for(int counter = 1; counter <= 10; counter++) { 
			System.out.print("Enter Scores " + counter + ": ");
			int scores = scanner.nextInt();
			sum += scores;
		}
			int average = sum / 10;
		
		System.out.println("The average of the score collected is: " + average);
		}
}
 