import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

	public class MenstralTracker {

		public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);


		String[] QuestionOne = {"A. I want to track my menstral cycle", "B. I want to track my period length", "C. know my safe period ", "D. I want to track my ovulation"};   
		System.out.println("What is your goal using this menstral application");
		for(int count = 0; count < QuestionOne.length; count++) { 
			System.out.println(QuestionOne[count]);
		}
		String response = scanner.nextLine();
		System.out.print("You are at the right place");


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
		LocalDate yourOvulationPeriodrange = yourOvulationPeriod.minusDays(5);
		LocalDate stopFlowPeriodForNextCycle = yourNextMenstralCycleis.plusDays(durationOfPeriod);
		LocalDate safePeriodrange1 = yourNextMenstralCycleis.minusDays(7);
		LocalDate safePeriodrange2 = yourNextMenstralCycleis.plusDays(durationOfPeriod);
	
		
		System.out.println("Your period will last for  " + durationOfPeriod);
		System.out.println("Your ovulation period is " + yourOvulationPeriod);
		System.out.println("Your fertility period is " + yourOvulationPeriodrange + " to " yourOvulationPeriod);
		System.out.println("Your safe period for the month are " + safePeriodrange1 + " to " + yourNextMenstralCycleis + " and " + safePeriodrange2 );
		System.out.println("Your next menstration period is from " + yourNextMenstralCycleis + " to " + stopFlowPeriodForNextCycle );
		

		
		}
	}

		