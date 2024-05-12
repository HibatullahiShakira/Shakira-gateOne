import datetime
import re
def calculate_age(DOB):
	current_date_time = datetime.datetime.now()
	today_date = current_date_time.date()
	birth_date_to_string = re.findall(r'\d+',date_of_birth)
	day = dateOfBirth / 1000000
	month = (dateOfBirth / 10000) % 100
	year = dateOfBirth % 10000
	if current_date_time.month < birthdate.month or (current_date_time.month == birthdate.month and current_date_time.day < birthdate.day):
        age -= 1
    return age

		

