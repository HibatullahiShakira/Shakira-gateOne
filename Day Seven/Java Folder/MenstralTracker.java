import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

	public class MenstralTracker {

		public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);


		String[] QuestionOne = {"A. I want to track my menstral cycle ", "B. I want to track my period ", "C. know my safe period ", "D. I am trying to conceive"};   
		System.out.println("What is your goal using this menstral application");
		for(int count = 0; count < QuestionOne.length; count++) { 
			System.out.println(QuestionOne[count]);
		}
		String response = scanner.nextLine();
		System.out.print("You are at the right place");

		
		String[] QuestionTwo = {"A. I am already used to it ", "B. Confusing ", "C. I want to understand it more ", "D. Hate it ", "E. I dont hate it either i dont like it" };   
		System.out.println("How do you feel about your period");
		for(int count = 0; count < QuestionTwo.length; count++) { 
		System.out.println(QuestionTwo[count]);}
		String responseTwo = scanner.nextLine();
		
		
		String[] QuestionThree = {"A. Normal ", "B. Angry ", "C. Happy ", "D. Sad ", "E. Depressed ", "F, Confused ", "G. Anxious ", "H. Exhausted "};   
		System.out.println("Understand your cycle better by using your body signal");
		for(int count = 0; count < QuestionThree.length; count++) { 
		System.out.println(QuestionThree[count]);}
		String responseThree = scanner.nextLine();


		String[] QuestionFour = {"A. Cramp  ", "B. Headache ", "C. Bloating ", "D. None of the above "};   
		System.out.println("How do you feel during your menstral period? ");
		for(int count = 0; count < QuestionFour.length; count++) { 
		System.out.println(QuestionFour[count]);}
		String responseFour = scanner.nextLine();

		String[] QuestionFive = {"A. Yes ", "great if your period runs like clockwork its a good indication that reproductive health and hormonal balance of estrogen-prostegen-taestorone is in good shape", "B. No Don't worry we will help you track and give you more insights on yours cycles and give more you more insights on your cycle as accurately as possible ", "C. I am not sure Thats okay, we will help you figure out and support track cycle either way" };   
		System.out.println("How do you feel during your menstral period? ");
		for(int count = 0; count < QuestionFive.length; count++) { 
		System.out.println(QuestionFive[count]);}
		String responseFive = scanner.nextLine();

		System.out.println("When did your last period start");
		String lastPeriodStart = scanner.nextLine();
		LocalDate lastPeriodStartn = StringDateObject.stringDateToDateobject(lastPeriodStart);

		System.out.println("When did your last period stop");
		String lastPeriodStop = scanner.nextLine();
		LocalDate lastPeriodStopn = StringDateObject.stringDateToDateobject(lastPeriodStop);

		long durationOfPeriod = ChronoUnit.DAYS.between(lastPeriodStartn, lastPeriodStopn);

		System.out.println("period length range from 21 to 40 days depending on most woman");
		System.out.print("What is your average cycle length: ");
		int cycleLength = scanner.nextInt();
		
		LocalDate yourNextMenstralCycleis = lastPeriodStartn.plusDays(cycleLength);
		LocalDate yourOvulationPeriod = yourNextMenstralCycleis.minusDays(14);
		LocalDate stopFlowPeriodForNextCycle = yourNextMenstralCycleis.plusDays(durationOfPeriod);
		LocalDate safePeriod1 = yourNextMenstralCycleis.minusDays(7);
		LocalDate safePeriod2 = yourNextMenstralCycleis.plusDays(durationOfPeriod);
	
		System.out.println("Your ovulation period is " +  yourOvulationPeriod.plusDays);
		System.out.print("Your safe period for the month are " + safePeriod1 + " to " + yourNextMenstralCycleis + " and " + safePeriod2 );
		System.out.print("Your next menstration period is from " + yourNextMenstralCycleis + " to " + stopFlowPeriodForNextCycle );
		

		
		}
	}

		