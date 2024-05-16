import java.util.Random;

	public class Accounts {

		private static final Random rand = new Random(); 
		private String accountNumber;
		private double balance;
		private String lastName;
		private String firstName;
		private String pin;
	

			public Accounts(String firstName, String lastName, String pin) {
				this.firstName= firstName;
				this.lastName= lastName;
				this.pin=pin;
				this.accountNumber = String.valueOf(rand.nextInt(100000000));
 			}

			public double getBalance() {
				return balance;
			}
			public double deposit(double amount) { 
				if(amount > 0.0) {
				this.balance += amount;
				}
				return balance;
			}
			public boolean withdraw(double amount) {
				if(balance >= amount) { 
					this.balance -= amount;
				return true;
			}
				return false;
			}

			public boolean transfer(Accounts toanotherAccount, double amount) { 
				if(amount <= balance) { 
					this.balance -= amount;
					toanotherAccount.deposit(amount);
						return true;
				}
				return false;
			}
	
			public String getAccountNumber() { 
				return accountNumber;
			}

			public boolean verifyPin(String pin){ 
			 	return this.pin.equals(pin);
			}
				
			public String changePin(String newPin) {
				this.pin.equals(newPin);
				return "pin changed succesfully";
			}
		
}
		
	

		


 