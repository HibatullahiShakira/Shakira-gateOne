def task_seven(element):
	sum = 0
	scores = []
	for elementCount in range(1, 11, 2):
		score = int(input("Enter score: "))
		scores.append(score)
		sum += elementCount
	return sum



