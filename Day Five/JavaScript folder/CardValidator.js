function cardNumberValidator(cardNumber) {
let cardNumberArray = null;
		
for(let cardNumberCounter = 0; cardNumberCounter < cardNumber.length; cardNumberCounter++) { 
	if(cardNumber.length > 16 || cardNumber.length < 16) { 
		console.log("Invalid Number, Please enter 16 digit number");
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

	

	

	
			 

		