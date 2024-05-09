import java.util.Random;
import java.util.Scanner;
	public class RandomProblems {

		public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int finalScore = 0;
		int randomQuestionA = random.nextInt();
		int randomQuestionB = random.nextInt(100);

		int randomArithmetic = randomQuestionA + randomQuestionB;

				
			for(int attemptCount = 0; attemptCount  < 10; attemptCount ++) {
			System.out.println("Question " + randomQuestionA + " + " + randomQuestionB );
			System.out.print("Please Enter your answer: "); 
			int answer = scanner.nextInt();

		if(answer == randomArithmetic) { 
			System.out.println("Correct");
			}
				finalScore++;

		if(answer != randomArithmetic) {
			System.out.println("Incorrect");
		}
			finalScore--;
		}


		System.out.print("Final score is: " + finalScore);

}
}

		
				
		

	
	
