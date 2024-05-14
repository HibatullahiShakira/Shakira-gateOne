import java.time.LocalDate;
public class StringDateObject {
	public static LocalDate stringDateToDateobject(String DOB) { 
		String characterRemoval = DOB.replaceAll("\\D", "");
		int dateOfBirth = Integer.parseInt(characterRemoval);
		int day = dateOfBirth / 1000000;
		int month = (dateOfBirth / 10000) % 100;
		int year = dateOfBirth % 10000;
		
		return LocalDate.of(year, month, day);
	}
	
}
