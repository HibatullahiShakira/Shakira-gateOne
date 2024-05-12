function cardNumberValidator(cardNumber) {
if(cardNumber.length != 16) { 
	console.log("Invalid Number, Please enter 16 digit number");
		return false;
		}

		let cardNumberIndex  = cardNumber.charCodeAt(0);
		//if(cardNumber.length == 16)  {		
			if(cardNumberIndex == '4' || cardNumberIndex == '5' || cardNumberIndex == '6') {
					return true;
			} else {
				return false;
			}
	//}


console.log(cardNumberValidator("6809898966745452"));
	




	



			 

		
	

	
			 

		