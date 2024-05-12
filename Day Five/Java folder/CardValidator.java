public class CardValidator { 

	public static Boolean cardNumberValidator(String cardNumber){

 
		if(cardNumber.length() != 16) { 
			System.out.println("Invalid Number, Please enter 16 digit number");
				return false;
		}
			
		char cardNumberIndex = cardNumber.charAt(0);
		//if(cardNumber.length() == 16)  {		
			if(cardNumberIndex == '4' || cardNumberIndex == '5' || cardNumberIndex == '6') {
					return true;
			} else {
				return false;
			}
	//}

	}
	public static void main(String[] args) {
		System.out.println(cardNumberValidator("6809898966745452"));
	}
}



	



			 

		