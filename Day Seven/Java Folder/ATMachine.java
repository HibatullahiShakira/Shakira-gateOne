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
		Account newAccount = new Account(firstName, secondName, pin, accountNumber);
			customersAccount.add(newAccount);
		System.out.println("Account successfully created. Your bank account name is " + firstName +  " " + secondName + getAccountNumber());
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
			System.out.println("Your new balance is: " +  Account.getAccountNumber());
			}
			System.out.println("Account not found");
		}

		private void withdraw() { 
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your account number");
		String accountNumber = scanner.nextLine();
			if(accountNumber == Account.getAccountNumber()) {
				Account.withdraw(amount);
				System.out.print("Your account balance is: " + Account.getAccountNumber());
				
			}
		}

		private void checkAccount() { 
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Enter your account number");
		String accountNumber = scanner.nextLine();
			if(accountNumber == Account.getAccountNumber()) {
				System.out.print("Your balance is " +  Account.getBalance());
			}
		}
		
		private void transfer() { 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your account number");
		String accountNumber = scanner.nextLine();
			if(accountNumber == Account.getAccountNumber()) {
				System.out.println("Enter the amount you want to transfer");
				int transferAmount = scanner.nextInt();
			}
		}

	public static void main(String[] args) { 
		createNewAccount();
		doDeposit();
		checkAccount();
		transfer();
	}
}
	 


		

		