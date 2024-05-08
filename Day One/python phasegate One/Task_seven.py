sum = 0;
for number in range(1, 11):
	scores = int(input("Enter scores: ")) 
	if scores % 2 == 0: 
		sum += scores
average = sum / 10
print(f"The average of the scores is: {average}")
print(f"The sum of the scores is: {sum}")


	
 