import datetime
import re
def calculate_age(date):
	current_date_time = datetime.datetime.now()
	#today_date = current_date_time.date()
	date_to_string = re.findall(r'\d+', date)
	day = int(date_to_string[0])  
	month = int(birth_date_to_string[1])
	year = int(birth_date_to_string[2])
	date_object = datetime.date(year, month, day)
	return date_object