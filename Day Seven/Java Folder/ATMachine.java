import java.util.ArrayList;
import java.util.Scanner;

	public class ATMachine 	{
	private ArrayList<Accounts> customerAccounts = new ArrayList<Accounts>();
	
		private Accounts accountFinder(String accountNumber) {
			for(Accounts account : customerAccounts) { 
				if(account.getAccountNumber().equals(accountNumber)) {
					return account;
				}
			}
			return null;
		}


		public void createNewAccount() { 
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your first name: ");
		String firstName = scanner.nextLine();
		System.out.println("Enter your Last name:");
		String lastName = scanner.nextLine();
		System.out.println("Create your pin(Enter a four digit pin)");
		String pin = scanner.nextLine();
		Accounts newAccount = new Accounts(firstName, lastName, pin);
			customerAccounts.add(newAccount);
		System.out.println("Account successfully created. Your bank account name is " + firstName + lastName + newAccount.getAccountNumber());
		}

		private void doDeposit() { 
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter account number");
		String accountNumber = scanner.nextLine();
			Accounts account = accountFinder(accountNumber);
			System.out.println("Enter the amount you want to deposit");
			double amount = scanner.nextDouble();
				if(account != null) {
					account.deposit(amount);
			System.out.println("Money deposited sucessfully");
			System.out.println("Your new balance is: " + account.getBalance());
			}else { 
			System.out.println("Account not found");
			}
		}

		private void withdraw() { 
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your account number");
		String accountNumber = scanner.nextLine();
		
		System.out.println("Enter the amount you want to withdrdaw");
		double amount = scanner.nextInt();
		Accounts account = accountFinder(accountNumber );
			if(accountNumber != null) {
				account.withdraw(amount);
				System.out.print("Your account balance is: " + account.getAccountNumber());
				
			}
		}

		private void checkAccountBalance() { 
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Enter your account number");
		String accountNumber = scanner.nextLine();
		Accounts account = accountFinder(accountNumber);
			if(accountNumber != null) {
				System.out.print("Your balance is " +  account.getBalance());
			}
		}
		
		private void transfer() { 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your account number");
		String accountNumberr = scanner.nextLine();
		Accounts accountNumberFrom  = accountFinder(accountNumberr );
			if(accountNumberFrom != null) {
				System.out.println("Enter the account number you want to transfer to");
				String accountNumbeer = scanner.nextLine();
				Accounts accountNumberTo = accountFinder(accountNumbeer);
					if(accountNumberTo != null) {
					System.out.print("Enter the amount you want to transfer");
					double transferAmount = scanner.nextDouble();
						boolean accountNumberFrom.transfer(accountNumberTo, transferAmount);
				System.out.println("Transfer Sucessful");
				System.out.println("Your current balance is " + accountNumberFrom.getAccountNumber());

				 	}
			}
		}

		public void startATMachineOperation() { 
		Scanner scanner = new Scanner(System.in);

		String menu = """
		
		Banke BankApplication
		
		1. Create a account
		2. Close account 
		3. Deposit money 
		4. Check Account balance
		5. Transfer from one account
		6. Withdraw Money 
		7. Change pin
		8. Exit application
		""";

	System.out.print(menu);
	int bankAppChoice = input.nextInt();

	switch(bankAppChoice){

	case 1: createNewAccount(scanner);
	break;

	case 2: closedAccount(scanner);
	break;

	case 3: doDeposit(scann	er);
	break;

	case 4: withdrawal(scanner);
	break;

	case 5: checkAccountBalance(scanner);
	break;

	case 6: transfer((scanner);
	break;

	case 7: changePin(scanner)
	break;

	
	case 8: System.out.pintln("thank you for banking with us");
	
	System.out.pintln("invalid choice, choose a vaid number between");
	public static void main(String[] args) {
	ATMachine atm = new ATMachine();
		startATMachineOperation() 
		atm.createNewAccount();
		atm.doDeposit();
		atm.checkAccountBalance();
		atm.transfer();
	}
}
	 


		

		