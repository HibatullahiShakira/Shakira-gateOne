import java.util.Scanner;

	public class MenstralTracker {

		public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);


		String[] QuestionOne = {"A. I want to track my menstral cycle ", "B. I want to track my period ", "C. know my safe period ", "D. I am trying to conceive"};   
		System.out.println("What is your target using this menstral application");
		for(int count = 0; count < QuestionOne.length; count++) { 
		System.out.println(QuestionOne[count]);}
		String response = scanner.nextLine();
		System.out.print("You are at the right place");

		
		String[] QuestionTwo = {"A. I am already used to it ", "B. Confusing ", "C. I want to understand it more ", "D. Hate it ", "E. I dont hate it either i dont like it" };   
		System.out.println("How do you feel about your period");
		for(int count = 0; count < QuestionTwo.length; count++) { 
		System.out.println(QuestionTwo[count]);}
		String responseTwo = scanner.nextLine();
		
		
		String[] QuestionThree = {"A. Normal ", "B. Angry ", "C. Happy ", "D. Sad ", "E. Depressed ", "F, Confused ", "G. Anxious ", "H. Exhausted "};   
		System.out.println("What is your target using this menstral application");
		for(int count = 0; count < QuestionThree.length; count++) { 
		System.out.println(QuestionThree[count]);}
		String responseThree = scanner.nextLine();


		String[] QuestionFour = {"A. Cramp  ", "B. Headache ", "C. Bloating ", "D. None of the above "};   
		System.out.println("How do you feel during your menstral period? ");
		for(int count = 0; count < QuestionFour.length; count++) { 
		System.out.println(QuestionFour[count]);}
		String responseFour = scanner.nextLine();



	

		
		}
	}

		