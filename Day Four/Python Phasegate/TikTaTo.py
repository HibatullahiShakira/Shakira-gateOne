tiktak = [3]*3
for counter in range(3): 
	for count in range(3):
		user_input = input("Enter x or o:  ")
		if userInput == "x" or userInput == "o":		
			tiktak[counter][count] = userInput
				
		else:
			print("Invalid inputs")			
for counter_print in range(3): 
	for count_print in range(3): 
		print(tiktak[counterPrint][countPrint] + " ");
	print("\n")
	



				
				