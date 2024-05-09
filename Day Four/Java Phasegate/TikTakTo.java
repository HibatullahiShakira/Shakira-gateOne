import java.util.Scanner;
	public class TikTakTo {
		public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		int rows = 3;
		int column = 3;
		String[][] tiktak = new String[rows][column];
		String userInput;
		for(int counter = 0; counter < 3; counter++) {
			for(int count = 0; count < 3; count++) {
				System.out.println("Enter x or o: ");
				userInput = scanner.nextLine();
				if(userInput.equals("x") || userInput.equals("o")) {		
					tiktak[counter][count] = userInput;
				}

				else {
					System.out.println("Invalid inputs");
				  }
			}
		}


		for(int counterPrint = 0; counterPrint < 3; counterPrint++) {
			for(int countPrint = 0; countPrint < 3; countPrint++) {
			System.out.print(tiktak[counterPrint][countPrint] + " " );
			}

			System.out.println();
		}


	}

}



				
				