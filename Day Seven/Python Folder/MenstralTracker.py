from datetime import datetime, timedelta

question_one = ["A. I want to track my menstral cycle", "B. I want to track my period length", "C. know my safe period ", "D. I want to track my ovulation"]  
for question in question_one: 
	print(question)
response = input("What is your goal using this menstral application")
print("You are at the right place")


last_period_start = input("When did your last period start(dd/MM/YYYY) ")
last_period_start_date_object = datetime.strptime(last_period_start, "%d/%m/%Y")

last_period_stop = input("When did your last period stop(dd/MM/YYYY) ")
last_period_stop_date_object = datetime.strptime(last_period_stop, "%d/%m/%Y")

duration_of_period = (last_period_start_date_object - last_period_stop_date_object).days

print("period length range from 21 to 40 days depending on most woman")
cycle_length = int(input("What is your average cycle length: "))
		
your_next_menstral_cycle_is = last_period_start_date_object + timedelta(days=cycle_length)
your_ovulation_period = your_next_menstral_cycle_is - timedelta(days= 14)
your_ovulation_period_range = your_ovulation_period - timedelta(days=5)
your_ovulation_period_rangee = your_ovulation_period + timedelta(days=5)
stop_flow_period_for_next_cycle = your_next_menstral_cycle_is + timedelta(days=duration_of_period )
safe_period_range_1 = your_next_menstral_cycle_is - timedelta(days=7);
safe_period_range_2 = your_next_menstral_cycle_is + timedelta(days=duration_of_period)
	
print(f"Your period will last for {duration_of_period}")
print(f"Your ovulation period is {your_next_menstral_cycle_is }");
print(f"Your safe period for the month are {safe_period_range_1} to {your_next_menstral_cycle_is} and {safe_ period_range_2}")
#print(f"Your next menstration period is from {your_next_menstral_cycle_is} to {stop_flow_period_for_next_cycle}")
print(f"Your next menstration period is {your_next_menstral_cycle_is}")
print(f"your fetility period is from {your_ovulation_period_range} to {your_ovulation_period_rangee}")
