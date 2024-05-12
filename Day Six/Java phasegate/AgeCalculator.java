import java.time.LocalDate;
	
	public class AgeCalculator { 

		public static int calculateAg(String DOB) { 

		String characterRemoval = DOB.replaceAll("\\D", "");
		int dateOfBirth = Integer.parseInt(characterRemoval);
		int day = dateOfBirth / 1000000;
		int month = (dateOfBirth / 10000) % 100;
		int year = dateOfBirth % 10000;
		
		LocalDate birthdate = LocaDate.of(year, month, day);
		LocalDate currentDOB = LocalDate.now();
		int presentAge = currentDOB.getYear() - birthdate.getYear();

		if (currentDOB.getMonthValue() < birthdate. getMonthValue() ||
           	 (currentDOB.getMonthValue() == birthdate.getMonthValue() &&
            	 currentDOB.getDayOfMonth() < birthdate.getDayOfMonth())) {
           	 age--;
        }

        return age;
    }


		System.out.print(currentDOB);

		
	}
}