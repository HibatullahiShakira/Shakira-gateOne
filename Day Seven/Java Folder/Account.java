import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random
	public class Account {
	ArrayList<Account> customerAccounts = new ArrayList<Account>();
		private static final Random rand = new Random(); 
		private String accountNumber;
		private double balance;
		private double lastName;
		private double firstName;
		private String pin;
	

			public Account(String firstName, String lastName, String pin) {
				this.firstName= firstName;
				this.secondName= lastName;
				this.pin=pin;
				this.accountNumber = String.valueOf(rand.nextInt(10000000000));
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
			public double withdraw(double amount) {
				if(balance >= amount) { 
					this.balance -= amount;
			}

			public double checkBalance() {
				return balance;
			}

			public double transfer(Account toanotherAccount, double amount) { 
				if(amount <= balance) { 
					balance -= amount;
					toanotherAccount.deposit(amount);
				}
			}
	
			public boolean verifyPin(String pin){ 
			 	return this.pin.equals(pin);
			}
				
			public String changePin(String newPin) {
				this.pin = newPin;
				return "pin changed succesfully";
			}
		}

		
	

		


 