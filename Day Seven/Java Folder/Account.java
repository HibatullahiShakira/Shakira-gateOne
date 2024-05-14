import java.util.ArrayList;
import java.util.Scanner;

	public class Account {
		//private static int 
		private String accountNumber;
		private double balance;
		private double lastName;
		private double firstName;;
	

			public Account(String firstName, String secondNumber, String pin) {
				this.firstName= firstName;
				this.secondName= secondName;
				this.pin = pin;
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


		


 