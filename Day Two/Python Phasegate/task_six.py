def task_six(element):
	sum = 0
	scores = []
	for elementCount in range(0, 11, 2):
		score = int(input("Enter score: "))
		scores.append(score)
		sum += elementCount
	return sum



