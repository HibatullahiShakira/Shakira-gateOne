card_number = input("Enter card number: ")
if len(card_number) != 16:
	print("Invalid Number")
if len(card_number) == 16:
	for _ in card_number:
		if card_number[0] == '4' or card_number[0] == '5' or card_number[0] == '6':
			print(True) 
	else:
		print(False)


	
	

	