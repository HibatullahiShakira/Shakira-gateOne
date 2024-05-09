import random
finalScore = 0
for _ in range(10):
	random_question_A = random.randrange(1,1000)
	random_question_B = random.randrange(1,1000)
	random_arithmetic = random_question_A  + random_question_B
	print(f"Question {random_question_A} + {random_question_B}");
	answer = int(input("Please Enter your answer: "))
	if answer == random_arithmetic: 
		print("Correct")
		finalScore += 1
	if answer != random_arithmetic: 
		print("Incorrect")
		print(f"The correct answer is {random_arithmetic}")
		finalScore -= 1
print(finalScore)

		
				
		

	
	
