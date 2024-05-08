import java.util.Scanner;
	public class TaskSeven {
	
		public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
	
		int sum = 0;
		int scores;
		for(int counter = 1; counter <=10; counter ++) { 
			if(scores <= 100 || scores <= 0) {
			System.out.print("Enter Scores " + counter + ": ");
			scores = scanner.nextInt();}
			sum += scores;

		}
		//int average = sum / 10;
		//System.out.println("The average of the even scores collected is: " + average);
		System.out.println("The sum of the even scores collected is: " + sum);
		}
}
 