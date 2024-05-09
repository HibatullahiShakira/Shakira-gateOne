const prompt = require("prompt-sync")(); 
let rows = 3;
let columns = 3;
let inputs = [rows][columns];
for(let counter = 0; counter < 3; counter++) {
	for(let count = 0; count < 3; count++) {
		let input = prompt("Enter x or o:  ");
		
		if(input == "x" || input == "o") {		
			inputs[counter][count] = input;
		}

		else {
			console.log("Invalid inputs");
				  }		
	}
}
for(let counterPrint = 0; counterPrint < 3; counterPrint++) {
	for(let countPrint = 0; countPrint < 3; countPrint++) {
		console.log(inputs[counterPrint][countPrint] + " " );
	}
		console.log("\n");

}


	

