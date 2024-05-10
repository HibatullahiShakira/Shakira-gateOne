card_number = input("Enter card number: ")
if len(card_number) > 16 or len(card_number) < 16:
	print("Invalid Number")
if len(card_number) == 16:
	if card_number[0:0:1] == 4:
		print(True) 
	else:
		print(False)


	
	

	