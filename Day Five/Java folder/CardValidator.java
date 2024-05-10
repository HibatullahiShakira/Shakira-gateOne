public class CardValidator { 

	public static boolean CardNumberValidator(String cardNumber) { 

		String[] cardNumberArray = null;
		
		for(int cardNumberCounter = 0; cardNumberCounter < cardNumber.length; cardNumberCounter++) { 
		if(cardNumber.length > 16 || cardNumber.length < 16) { 
			System.out.print("Invalid Number, Please enter 16 digit number");
		}
			

		if(cardNumber.length == 16)  { 		
			if(cardNumber.length[0] == "4" || cardNumber.length[0] == "5" || cardNumber.length[0] == "6") { 
					return true;
			}
			if(cardNumber.length[0] != "4" || cardNumber.length[0] != "5" || cardNumber.length[0] != "6") {
				return false;
			}
		}
}
}

	

	

	
			 

		