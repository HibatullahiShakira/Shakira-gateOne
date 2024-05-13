import java.util.Scanner;
import java.time.LocalDate;
	
	public class AgeCalculator { 

		public static int calculateAge(String DOB) { 
		String characterRemoval = DOB.replaceAll("\\D", "");
		int dateOfBirth = Integer.parseInt(characterRemoval);
		int day = dateOfBirth / 1000000;
		int month = (dateOfBirth / 10000) % 100;
		int year = dateOfBirth % 10000;
		
		LocalDate birthdate = LocalDate.of(year, month, day);
		LocalDate currentDOB = LocalDate.now();
		int presentAge = currentDOB.getYear() - birthdate.getYear();

		if (currentDOB.getMonthValue() < month ||
           	 (currentDOB.getMonthValue() == month &&
            	 currentDOB.getDayOfMonth() < day)) {
           		presentAge--;
       		 }

        return presentAge;
    }


public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter date of birth: ");
String dateOfBirth = scanner.nextLine();
System.out.print(calculateAge(dateOfBirth));

		
	}
}