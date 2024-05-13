import datetime
import re
def calculate_age(date_of_birth):
	current_date_time = datetime.datetime.now()
	today_date = current_date_time.date()
	birth_date_to_string = re.findall(r'\d+', date_of_birth)
	day = int(birth_date_to_string[0])  
	month = int(birth_date_to_string[1])
	year = int(birth_date_to_string[2])
	birth_date = datetime.date(year, month, day)
	age = today_date.year - birth_date.year
	if today_date .month < month or (today_date .month == month and today_date .day < day):
       	 age -= 1
	return age

print(calculate_age("05-09-1999"))

