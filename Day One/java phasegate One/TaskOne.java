import java.util.Scanner;
	public class TaskOne {
	
		public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
	
		int sum = 0;
		for(int counter = 1; counter <= 10; counter++) { 
			System.out.print("Enter Scores " + counter + ": ");
			int scores = scanner.nextInt();
			sum += scores;
		}
		
		System.out.println("The sum of the scores is: " + sum);
		}
}
 