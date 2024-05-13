function calculateAge(String DOB) { 
		const characterRemoval = DOB.replace(/\D/g, "");
		const dateOfBirth = parseInt(characterRemoval);
		const day = dateOfBirth // 1000000;
		const month = (dateOfBirth // 10000) % 100;
		const year = dateOfBirth % 10000;
		
		const birthdate = LocalDate.of(year, month, day);
		const currentDOB = new Date();
		let presentAge = currentDOB.getYear() - birthdate.getYear();
		

		if (currentDOB.getMonth() < birthdate.getMonth ||
           	 (currentDOB.getMonth() == birthdate.getMonth &&
            	 currentDOB.getDate() < birthday.getDate)) {
           		presentAge--;
       		 }

        return presentAge;
	}    
dateOfBirth = prompt("Enter date of birth: ");
console.log(calculateAge(dateOfBirth));
