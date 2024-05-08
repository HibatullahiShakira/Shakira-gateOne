import java.util.Scanner;
	public class TaskSixteen {

		public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		int result = 0;
		for(int numbers = 4; numbers <= 10; numbers += 4) {
			for(int number = 0; number <= 5; number++) {
			result = (int)Math.pow(numbers, number);
			 System.out.print(result + " ");
			}
		}
}
}

	
	