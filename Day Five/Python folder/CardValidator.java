//public static boolean CardNumberValidator(String cardNumber){
import java.util.Scanner;
	public class CardValidator { 

		public static void main(String[] args){ 
		Scanner scanner = new Scanner(System.in);

			System.out.print("Enter cardNumber: ");
			String cardNumber = scanner.nextLine();
		
			int cardNumberLength = cardNumber.length();

		if(cardNumberLength > 16 || cardNumberLength < 16) { 
			System.out.print("Invalid Number");
			}
		else{ 
			System.out.print("Invalid Number, Please enter 16 digit number");
		}
			

		if(cardNumberLength = 16)  { 
			if(cardNumberLength[0] == "4" || cardNumberLength[0] == "5" || cardNumberLength[0] == "6") { 
				System.out.print(true);
			else{
				System.out.print(false);
}
}
}

	

	

		








		//for(int cardNumberCounter = 0; cardNumberCounter < cardNumberLength; cardNumberCounter++) { 		
			 

		