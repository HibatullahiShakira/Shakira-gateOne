scores = []
for score_count in range (10):
	score = int(input("Enter score: "))
	scores.append(score)
for scorePrint in range(10):
	print(scores[scorePrint], end = " ")
