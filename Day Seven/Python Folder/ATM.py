import random
account_list = []
balance = 0
pin = ''
def create_account(first_name, secondName, pin, balance):


	account_number = random.randint(100000000)
	global balance 
	account_details = [first_name, second_name, pin, balance]
	account_list.append(account_details)
	return f"Your account number as been created sucesfullly, Here is your details \n{first_name} {secondName} \nyour pin is{pin} \nAccount number: {account_number_to_string}"
	
def balance:
	global balance
	return balance 
	
def closeAccount(account_number):
	if account_number in account_details:
		 account_list.remove(account_details)
	return Account closed sucessfully

def withdraw_money(amount):
	global balance 
	if amount > balance:
		balance -= amount
		return balance
	else: 
		return insufficient fund
def deposit_money(amount):
	global balance
	balance += amount
	return f" {balance} \nAmount deposited sucessfully" 

def transfer(account_number_to, account_number_from, amount):
	global balance 
	if account_number_from in account_list:
		balance -= amount
	else: 
		print account number not found
	
	if account_number_to in account_list:
		balance += amount
		return f'{balance} \nAmount transfered sucessfully'
	else: 
		print account_number not found

def change_pin(new_pin):
	global pin
	pin = new_pin
	return pin changed sucessfully



		
def app_menu():

account_options = input(int('''
1. Create account
2. close account
3. withdraw money 
4. change pin
5. deposit money
6. transfer money
7. exit application
'''
 		
match account_options:
case 1:
	account_options()
case 2:	
	closeAccount()
case 3:
	withdraw_money
case 4:
	deposit_money()
case 5: 
	change_pin()
case 6:
	transfer()

	