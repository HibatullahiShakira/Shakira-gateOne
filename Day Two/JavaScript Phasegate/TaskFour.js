const prompt = require("prompt-sync")();

let scores = [10] 
let sum = 0
for(let scoreCount = 0; scoreCount < 10; scoreCount++) {
	let score = Number(prompt("Enter scores: "));
		scores.push(score);
		if(scoreCount % 2 == 0) { sum += scoreCount}
	}
	
	for(let scorePrint = 0; scorePrint < 10; scorePrint++) {
	console.log(sum);
	}