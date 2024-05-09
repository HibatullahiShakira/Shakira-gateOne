const prompt = require("prompt-sync")();
		
		let finalScore = 0;
		let randomQuestionA = Math.floor(Math.random());
		let randomQuestionB = Math.floor(Math.random());

		let randomArithmetic = randomQuestionA + randomQuestionB;

				
			for(int attemptCount = 0; attemptCount  < 10; attemptCount ++) {
			console.log("Question " + randomQuestionA + " + " + randomQuestionB);
			let answer = Number(prompt("Please Enter your answer: "));


		if(answer == randomArithmetic) { 
			console.log("Correct");
		}
				finalScore++;

		if(answer != randomArithmetic) {
			console.log("Incorrect");
			} 
				finalScore--;
		}

}
}

		
				
		

	
	
