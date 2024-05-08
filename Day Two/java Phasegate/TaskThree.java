import java.util.Scanner;
public class TaskTwo { 

	public static void main(String[] args) { 
	Scanner scanner = new Scanner (System.in);
	
	int[] scores = new int [10];

	for(int scoreCount = 0; scoreCount < 10; scoreCount++) {
	System.out.println("Enter scores: ");
	scores[scoreCount] = scanner.nextInt();
	}

	for(int scorePrint = 0; scorePrint < 10; scorePrint++) {
	System.out.println(scores[scorePrint]);
	}
	}
}