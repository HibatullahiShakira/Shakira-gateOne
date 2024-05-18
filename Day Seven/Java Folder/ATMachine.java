import java.util.ArrayList;
import java.util.Scanner;

	public class ATMachine 	{
	private Scanner scanner = new Scanner(System.in);
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
		//Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
		System.out.println("Enter your first name: ");
		String firstName = scanner.nextLine();
		System.out.println("Enter your Last name:");
		String lastName = scanner.nextLine();
		System.out.println("Create your pin(Enter a four digit pin)");
		String pin = scanner.nextLine();
		Accounts newAccount = new Accounts(firstName, lastName, pin);
			customerAccounts.add(newAccount);
		System.out.println("Account successfully created. Your bank account name is " + firstName + lastName + "\n" + newAccount.getAccountNumber() + "\nBanke Bank");
		}

		private void doDeposit() { 
		System.out.println("Enter account number");
		String accountNumber = scanner.nextLine();
			Accounts account = accountFinder(accountNumber);
			System.out.println("Enter the amount you want to deposit");
			double amount = scanner.nextDouble();
				if(account == account) {
					account.deposit(amount);
			System.out.println("Money deposited sucessfully");
			System.out.println("Your new balance is: " + account.getBalance());
			}else { 
			System.out.println("Account not found");
			}
		}

		private void withdraw() { 
		System.out.println("Enter your account number");
		String accountNumber = scanner.nextLine();
		
		System.out.println("Enter the amount you want to withdrdaw");
		double amount = scanner.nextInt();
		Accounts account = accountFinder(accountNumber);
			if(accountNumber == account) {
				account.withdraw(amount);
				System.out.print("Your account balance is: " + account.getAccountNumber());
				
			}
		}

		private void checkAccountBalance() { 	
		System.out.println("Enter your account number");
		String accountNumber = scanner.nextLine();
		Accounts account = accountFinder(accountNumber);
			if(account == account) {
				System.out.print("Your balance is " +  account.getBalance());
			}
		}
		
		private void transfer() { 
		System.out.println("Enter your account number");
		String accountNumberr = scanner.nextLine();
		System.out.print("Enter the amount you want to transfer");
		double transferAmount = scanner.nextDouble();
		Accounts accountNumberFrom  = accountFinder(accountNumberr );
			if(accountNumberFrom == account) {
				accountNumberFrom.withdraw(transferAmount);
				}
			else { System.out.println("Account not found"); 
			}

			
			System.out.println("Enter the account number you want to transfer to");
			String accountNumbeer = scanner.nextLine();
			Accounts accountNumberTo = accountFinder(accountNumbeer);
			if(accountNumberTo == account) {
				accountNumberTo.deposit(transferAmount);
				System.out.println("Transfer Sucessful");
				System.out.println("Your current balance is " + accountNumberFrom.getBalance());
			}
			else { System.out.println("Transaction failed");
			}		
			//scanner.close();
		}
		

		public void startATMachineOperation() { 
		Scanner scanner = new Scanner(System.in);
		
		//while(true)

	System.out.print("Banke BankApplication\n1. Create a account \n2. Close account\n3. Deposit money\n4. Check Account balance \n5. Transfer from one account \n6. Withdraw Money \n7. Change pin \n8. Exit application");
	int bankAppChoice = scanner.nextInt();

	switch(bankAppChoice){

	case 1: createNewAccount();
	break;

	//case 2: closedAccount();
	//break;

	case 3: doDeposit();
	break;

	case 4: withdraw();
	break;

	case 5: checkAccountBalance();
	break;

	case 6: transfer();
	break;

	//case 7: changePin();
	//break;

	
	case 8: System.out.println("thank you for banking with us");
	//return;
	default: System.out.println("invalid choice, choose a vaid number between");
	}
}
	public static void main(String[] args) {
	ATMachine atm = new ATMachine();
		atm.startATMachineOperation(); 
		//atm.createNewAccount();
		//atm.doDeposit();
		//atm.checkAccountBalance();
		//atm.transfer();
	}
}
	 


		

		