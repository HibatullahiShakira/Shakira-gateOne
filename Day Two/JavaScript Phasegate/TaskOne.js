const prompt = require("prompt-sync")();

let scores = [10] 

for(let scoreCount = 0; scoreCount < 10; scoreCount++) {
	let score = Number(prompt("Enter scores: "));
	}
	
	for(let scorePrint = 0; scorePrint < 10; scorePrint++) {
	console.log(scores[scorePrint]);
	}