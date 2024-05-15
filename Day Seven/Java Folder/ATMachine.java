import java.util.Scanner;

	public class ATMachine 	{

	public void createNewAccount() { 
	Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your first name: ");
		String firstName = scanner.nextLine();
		System.out.println("Enter your Last name:");
		String lastName = scanner.nextLine();
		System.out.println("Create your pin(Enter a four digit pin)");
		String pin = scanner.nextLine();
		Account newAccount = new Account(firstName, secondName, pin);
			customersAccount.add(newAccount)
		System.out.println("Account successfully created. Your bank account name is  " firstName +  " " + secondName + getAccountNumber());
		}

		private void doDeposit() { 
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter account number");
		String accountNumber = scanner.nextLine();
			if(accountNumber == Account.getAccountNumber()) {
				Account.deposit(amount);
			System.out.println("Enter the amount you want to deposit");
			int amount = scanner.nextInt();
			System.out.println("withdrawal Sucessful");
			System.out.print("Your new balance is: " Account.getAccountNumber());
			}
			System.out.println("Account not found");
		}

		private void withdraw() { 
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your account number");
		String accountNumber = scanner.nextLine();
		System.out.print("Enter the amount you want to withdraw");
		int withdrawAmount = scanner.nextLine();
		if(accountNumber == Account.getAccountNumber()) {
				Account.deposit(amount);
		}
		private void checkAccount() { 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your Account Number");

		