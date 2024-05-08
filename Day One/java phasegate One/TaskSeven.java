import java.util.Scanner;
	public class TaskSeven {
	
		public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
	
		int sum = 0;
		for(int counter = 1; counter <=10; counter ++) { 
			System.out.print("Enter Scores " + counter + ": ");
			int scores = scanner.nextInt();
			if(scores % 2 == 0){ sum += scores;}
		}
		int average = sum / 10;
		System.out.println("The average of the even scores collected is: " + average);
		System.out.println("The sum of the even scores collected is: " + sum);
		}
}
 