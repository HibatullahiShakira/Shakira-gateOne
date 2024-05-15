import java.util.ArrayList;
import java.util.Scanner;
	ArrayList<Account> customerAccounts = new ArrayList<Account>();
	public class Account {
		private Static int nextUserAccountNumber = 23423213; 
		private String accountNumber;
		private double balance;
		private double lastName;
		private double firstName;
		private String pin;
	

			public Account(String firstName, String secondNumber, String pin) {
				this.firstName= firstName;
				this.secondName= secondName;
				this.pin = pin;
				this.accountNumber = String.valueOf(nextUserAccountNumber++);
 			}

			public String getAccountNumber() {
				return accountNumber;
			}
 
			public double getBalance() {
				return balance;
			}
			public void deposit(double amount) { 
				if(amount > 0.0) {
				this.balance += amount;
				}
			}
			public String withdraw(double amount) {
				if(balance => amount) { 
					this.balance -= amount;
					return withdrawal sucessful;
				}
				return insufficient funds;
			}
			public double checkBalance() {
				return balance;
			}

			public String transfer(Account toanotherAccount, double amount) { 
				if(amount <= balance) { 
					balance -= amount;
					toanotherAccount.deposit(amount) 
				return transfer sucessful;
				}
			return transaction failed;
			}
	
			public String verifyPin(String pin){ 
			 	this.pin.equals.(pin);
				return correct pin, verification successful;
				}
			return incorrect pin, pin verification not sucessful;
			}
				
			public String changePin(String newPin) {
				this.pin = newpin
				return pin changed succesfully;
			}
		}

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
		System.out.println("Enter the amount you want to deposit");
		int amount = scanner.nextInt();
			if(accountNumber == Account.getAccountNumber()) {
				Account.deposit(amount);
			System.out.println("withdrawal Sucessful");
			}
			System.out.println("Account not found");

	}


		


 