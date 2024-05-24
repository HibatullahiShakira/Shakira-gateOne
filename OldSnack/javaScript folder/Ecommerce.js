const prompt = require("prompt-sync")();

	let customerName = prompt("What is the customer's name?: ");

	let items = [];
	quantities = [];
	prices = [];
 
	let moreItems;
	let total = 0;
	do  {
	let item = prompt("What did user buy?: ");
		items.push(item);

	let quantity = parseFloat(prompt("How many pieces?: "));
			quantities.push(quantity);

	let price = parseFloat(prompt("How much per unit?: "));
			prices.push(price);
	total += price * quantity; 

	let moreItems = ("Would you Add more Items?(enter yes or no: ").toLowerCase();

	} while(moreItems === "yes");

	let cashierName = prompt("What is your name?: ");

	let discount = parseFloat(prompt("How much discount will he get?: "));

	let discountAmount = total * (discount / 100);
	let VATamount = total * (17.50 / 100);
	let billTotal = total - discountAmount + VATamount;

	console.log(`

	SEMICOLON STORES
	MAIN BRANCH
	LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
	TEL: 03293828343
	DATE: 18-DEC-22 8:48:11 pm
	`);

	console.log("Customer's Name:" + customerName);
	console.log("Cashier:" + cashierName);
	console.log("\n=============================================================");
	console.log("\nITEM\t\tQTY\tPRICE\t\tTOTAL(NGN");

	console.log("\n---------------------------------------------------------------");
	
	for(let i = 0; i < items.length; i++) {

	console.log("\n" + items[i] + "\t\t" + quantities[i].toFixed(2) + "\t" + prices[i].toFixed(2) + "\t\t" + (quantities[i] * prices[i]).toFixed(2));
	}

	console.log("\n-----------------------------------------------------------------");
	console.log("\n\t\t\tSub Total:\t  " + total.toFixed(2));
	console.log("\n\t\t\tDiscount:\t " + discountAmount.toFixed(2));
	console.log("\n\t\t\tVAT @ 17.50:\t  " + VATamount.toFixed(2));

	console.log("\n-------------------------------------------------------------------");
	console.log("\n\t\t\tBill Total:\t  " + billTotal.toFixed(2));

	console.log("\n------------------------------------------------------------------");
	console.log("\nTHIS IS NOT A RECEIPT KINDLY PAY  " + billTotal.toFixed(2));

	let amount = parseFloat(prompt("How much did customer give you?:  "));

	let balance = amount - billTotal;

	console.log(`

	SEMICOLON STORES
	MAIN BRANCH
	LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
	TEL: 03293828343
	DATE: 18-DEC-22 8:48:11 pm
	`);

	console.log("Customer's Name:  " + customerName);
	console.log("Cashier:  " + cashierName);
	console.log("\n=================================================================");
	console.log("\nITEM\t\tQTY\tPRICE\t\tTOTAL(NGN");

	console.log("\n------------------------------------------------------------------");
	
	for(let i = 0; i < items.length; i++) {

	console.log("\n" +  items[i] + "\t\t" + quantities[i].toFixed(2) + "\t" + prices[i].toFixed(2)  + "\t\t" + (quantities[i] * prices[i]).toFixed(2));
	}

	console.log("\n-----------------------------------------------------------------");
	console.log("\n\t\t\tSub Total:\t  " + total.toFixed(2));
	console.log("\n\t\t\tDiscount:\t\ " + discountAmount.toFixed(2));
	console.log("\n\t\t\tVAT @ 17.50:\t  " + VATamount.toFixed(2));

	console.log("\n=====================================================================");
	console.log("\n\t\t\t\tBill Total:  " + billTotal.toFixed(2));
	console.log("\n\t\t\t\tAmount Paid:  " + amount.toFixed(2));
	console.log("\n\t\t\t\tBalance:  " + balance.toFixed(2));
	console.log("\n=====================================================================");
	console.log("\nTHANK YOU FOR YOUR PATRONAGE");
	console.log("\n=====================================================================");

