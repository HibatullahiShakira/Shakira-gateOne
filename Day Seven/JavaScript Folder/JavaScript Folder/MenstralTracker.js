const prompt = require("prompt-sync")();

const QuestionOne = ["A. I want to track my menstral cycle", "B. I want to track my period length", "C. know my safe period ", "D. I want to track my ovulation"];   
	for(let count = 0; count < QuestionOne.length; count++) { 
		console.log(QuestionOne[count]);
		}
		let response = prompt("What is your goal using this menstral application");
		console.log("You are at the right place");
		
const QuestionTwo = ["A. I am already used to it ", "B. Confusing ", "C. I want to understand it more ", "D. Hate it ", "E. I dont hate it either i dont like it"];   
	for(let count = 0; count < QuestionTwo.length; count++) { 
		console.log(QuestionTwo[count]);}
		let responseTwo = prompt("How do you feel about your period");		
		
const QuestionThree = ["A. Normal ", "B. Angry ", "C. Happy ", "D. Sad ", "E. Depressed ", "F, Confused ", "G. Anxious ", "H. Exhausted "];   
		for(let count = 0; count < QuestionThree.length; count++) { 
		console.log(QuestionThree[count]);}
		let responseThree = prompt("Understand your cycle better by using your body signal");

const QuestionFour = ["A. Cramp  ", "B. Headache ", "C. Bloating ", "D. None of the above "];   
		console.log("How do you feel during your menstral period? ");
		for(let count = 0; count < QuestionFour.length; count++) { 
		console.log(QuestionFour[count]);}
		let responseFour = prompt("How do you feel during your menstral period? ");

const QuestionFive = ["A. Yes ", "great if your period runs like clockwork its a good indication that reproductive health and hormonal balance of estrogen-prostegen-taestorone is in good shape", "B. No Don't worry we will help you track and give you more insights on yours cycles and give more you more insights on your cycle as accurately as possible ", "C. I am not sure Thats okay, we will help you figure out and support track cycle either way" ];   
		for(let count = 0; count < QuestionFive.length; count++) { 
		console.log(QuestionFive[count]);}
		let responseFive = prompt("How do you feel during your menstral period? ");

let lastPeriodStart = prompt("When did your last period start ");
let lastPeriodStartDateObject = new Date(lastPeriodStart);

let lastPeriodStop = prompt("When did your last period stop");
let lastPeriodStopDateObject = new Date(lastPeriodStop);

let durationOfPeriod = Date (lastPeriodStartDateObject - lastPeriodStopDateObject ) / (1000 * 60 * 60 * 24);

console.log("period length range from 21 to 40 days depending on most woman");
let cycleLength = Number(prompt("What is your average cycle length: "));
		
let yourNextMenstralCycleis = new Date(lastPeriodStopDateObject); lastPeriodStopDateObject.setDate(lastPeriodStopDateObject.getDate() + cycleLength);
let yourOvulationPeriod = new Date(lastPeriodStopDateObject); lastPeriodStopDateObject.setDate(lastPeriodStopDateObject.getDate() - 14); 
let yourOvulationPeriodrange = new Date(yourOvulationPeriod); yourOvulationPeriod.setDate(yourOvulationPeriod.getDate() - 5);
let stopFlowPeriodForNextCycle = new Date(lastPeriodStopDateObject); lastPeriodStopDateObject.setDate(lastPeriodStopDateObject.getDate() + durationOfPeriod);
let safePeriodrange1 = new Date(yourNextMenstralCycleis); yourNextMenstralCycleis.setDate(yourNextMenstralCycleis.getDate - 7);
let safePeriodrange2 = new Date (yourNextMenstralCycleis); yourNextMenstralCycleis.setDate(yourNextMenstralCycleis.getDate + durationOfPeriod);
	
console.log("Your period will last for  " + durationOfPeriod);
console.log("Your ovulation period is " +  yourOvulationPeriod);
console.log("Your safe period for the month are " + safePeriodrange1 + " to " + yourNextMenstralCycleis + " and " + safePeriodrange2 );
console.log("Your next menstration period is from " + yourNextMenstralCycleis + " to " + stopFlowPeriodForNextCycle );
		
		