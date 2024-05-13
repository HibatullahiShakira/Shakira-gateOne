customer_name = input("What is the customer's name?: ")
total = 0
items = []
quantities = []
prices = []
more_items = 'yes'
while more_items.lower() == 'yes':
	item = input("what did user buy?: ")
	items.append(item)

	quantity = float(input("How many piesces?: "))
	quantities.append(quantity)

	price = float(input("How much per unit?: "))
	prices.append(price)

	total += price * quantity; 

	more_items = input("Would you Add more Items?(enter yes or no:) ").strip().lower()

cashier_name = input("What is your name?: ")
discount = float(input("How much discount will he get?: "))
discount_amount = total * (discount / 100)
VAT_amount = total * (17.50 / 100)
bill_Total = total - discount_amount + VAT_amount
print("\nSEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS")
print("TEL: 03293828343")
print("DATE: 18-DEC-22 8:48:11 pm")
print(f"\nCustomer's Name: {customer_name}")
print(f"Cashier's Name: {cashier_name}")
print("=============================================================")
print("\nITEM\\t\tQTY\tPRICE\t\tTOTAL(NGN")
print("\n---------------------------------------------------------------")

for i in range (len(items)):
	print(f"{items[i]} \t {quantities[i]} \t {prices[i]} \t {quantities[i] * prices[i]}")
print("\n-----------------------------------------------------------------")
print(f"\n\t\t\t\tSub Total: {total:.2f}")
print(f"\n\t\t\t\tDiscount: {discount_amount:.2f}")
print(f"\n\t\t\t\tVAT @ 17.50%: {VAT_amount}")
print("\n-------------------------------------------------------------------")
print(f"\t\t\t\tBill Total {bill_Total}")
print("\n------------------------------------------------------------------")
print(f"THIS IS NOT A RECEIPT KINDLY PAY {bill_Total:.2f}")


amount = float(input("How much did customer give you?: "))
balance = amount - bill_Total


print("\nSEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS")
print("TEL: 03293828343")
print("DATE: 18-DEC-22 8:48:11 pm")
print(f"\nCustomer's Name: {customer_name}")
print(f"Cashier's Name: {cashier_name}")
print("======================================================================")
print("\nITEM\\t\tQTY\tPRICE\t\tTOTAL(NGN")
print("\n--------------------------------------------------------------------")

for i in range (len(items)):
	print(f"{items[i]} \t {quantities[i]} \t {prices[i]} \t {quantities[i] * prices[i]}")
print("\n-----------------------------------------------------------------")
print(f"\n\t\t\t\tSub Total: {total:.2f}")
print(f"\n\t\t\t\tDiscount: {discount_amount:.2f}")
print(f"\n\t\t\t\tVAT @ 17.50%: {VAT_amount}")
print("\n=====================================================================")
print(f"\n\t\t\t\tBill Total {bill_Total}")
print(f"\n\t\t\t\tAmount Paid {amount}")
print(f"\n\t\t\t\tBalance {balance}")
print("\n=====================================================================")
print("\nTHANK YOU FOR YOUR PATRONAGE")
print("\n=====================================================================")







