scores = []
for score_count in range (11):
	score = int(input("Enter score: "))
	scores.append(score)
for scorePrint in range(11):
	print(f"{scores[scorePrint]}")
