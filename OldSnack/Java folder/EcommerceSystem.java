import java.util.ArrayList;
import java.util.Scanner;
	
	public class EcommerceSystem {

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("What is the customer's name?: ");
	String customerName = scanner.nextLine();

	ArrayList<String> items = new ArrayList<String>();
	ArrayList<Double> quantities = new ArrayList<Double>();
	ArrayList<Double> prices = new ArrayList<Double>();
 

	double total = 0;
	String moreItems;
	do  {
	System.out.println("What did user buy?: ");
	String item = scanner.nextLine();
		items.add(item);

	System.out.println("How many pieces?: ");
	double quantity = scanner.nextDouble();
			quantities.add(quantity);

	System.out.println("How much per unit?: ");
	double price = scanner.nextDouble();
			prices.add(price);
	total += price * quantity; 

			scanner.nextLine();

	System.out.println("Would you Add more Items?(enter yes or no: ");
	moreItems = scanner.nextLine().trim().toLowerCase();

	} while(moreItems.equals("yes"));

	System.out.println("What is your name?: ");
	String cashierName = scanner.nextLine();

	System.out.println("How much discount will he get?: ");
	double discount = scanner.nextDouble();

	double discountAmount = total * (discount / 100);
	double VATamount = total * (17.50 / 100);
	double billTotal = total - discountAmount + VATamount;

	System.out.println("""

	SEMICOLON STORES
	MAIN BRANCH
	LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
	TEL: 03293828343
	DATE: 18-DEC-22 8:48:11 pm
	""");

	System.out.println("Customer's Name:" + customerName);
	System.out.print("Cashier:" + cashierName);
	System.out.print("\n=============================================================");
	System.out.print("\nITEM\t\tQTY\tPRICE\t\tTOTAL(NGN");

	System.out.print("\n---------------------------------------------------------------");
	
	for(int i = 0; i < items.size(); i++) {

	System.out.printf("\n%s\t%.0f\t%.2f\t%.2f\n", items.get(i), quantities.get(i), prices.get(i), quantities.get(i) * prices.get(i));
	}

	System.out.print("\n-----------------------------------------------------------------");
	System.out.printf("\n\t\t\tSub Total:%.2f\t\n  ", total);
	System.out.printf("\n\t\t\tDiscount:%.2f\t\n  ", discountAmount);
	System.out.printf("\n\t\t\tVAT @ 17.50:%.2f\t\n  ", VATamount);

	System.out.print("\n-------------------------------------------------------------------");
	System.out.printf("\n\t\t\tBill Total%.2f\t\n  ", billTotal);

	System.out.print("\n------------------------------------------------------------------");
	System.out.println("\nTHIS IS NOT A RECEIPT KINDLY PAY  " + billTotal);

	System.out.println("How much did customer give you?:  ");
	double amount = scanner.nextDouble();

	double balance = amount - billTotal;

	System.out.println("""

	SEMICOLON STORES
	MAIN BRANCH
	LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
	TEL: 03293828343
	DATE: 18-DEC-22 8:48:11 pm
	""");

	System.out.println("Customer's Name:  " + customerName);
	System.out.print("Cashier:  " + cashierName);
	System.out.print("\n=================================================================");
	System.out.print("\nITEM\t\tQTY\tPRICE\t\tTOTAL(NGN");

	System.out.print("\n------------------------------------------------------------------");
	
	for(int i = 0; i < items.size(); i++) {

	System.out.printf("\n%s\t%.0f\t%.2f\t%.2f\n", items.get(i), quantities.get(i), prices.get(i), quantities.get(i) * prices.get(i));
	}

	System.out.print("\n-----------------------------------------------------------------");
	System.out.printf("\n\t\t\tSub Total:%.2f\t\n  ", total);
	System.out.printf("\n\t\t\tDiscount:%.2f\t\n  ", discountAmount);
	System.out.printf("\n\t\t\tVAT @ 17.50:%.2f\t\n  ", VATamount);

	System.out.print("\n=====================================================================");
	System.out.printf("\n\t\t\t\tBill Total:%.2f  ", billTotal);
	System.out.printf("\n\t\t\t\tAmount Paid:%.2f  ", amount);
	System.out.printf("\n\t\t\t\tBalance:%.2f  ", balance);
	System.out.print("\n=====================================================================");
	System.out.print("\nTHANK YOU FOR YOUR PATRONAGE");
	System.out.print("\n=====================================================================");



	



		scanner.close();

	}
}