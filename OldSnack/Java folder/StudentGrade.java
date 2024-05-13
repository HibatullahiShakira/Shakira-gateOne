import java.util.Scanner;

	public class LagbajaStudentGrade{

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			scanner.nextLine();

		int[][] studentSubject = new int[student][subject];
		int[] totalScores = new int[student];
		int[] totalAverage = new int[student];
		int[] studentTotalScores = new int[student];
		double[] studentTotalAverage = new double[student];
		int[] highestScore = new int[subject];
		int[] lowestScore = new int[subject];
		int[] pass = new int[subject];
		int[] fail = new int[subject];
		int[] subjectTotalScores = new int[subject];
		double[] subjectTotalAverage = new double[subject];



		for(int y = 0; y < subject; y++) {
				lowestScore[y] = 100	;
				highestScore[y] = 0;
		}


		for(int i = 0; i < student; i++) {
			System.out.println("Entering score for student " + (i + 1) + ":  ");
			for(int j = 0; j < subject; j++) {
				System.out.println("Enter score for subject " + (j + 1) + ":  ");
				studentSubject[i][j] = scanner.nextInt();
				totalScores[i] += studentSubject[i][j];
				totalAverage[i] = (float) totalScores[i] / (student);
				System.out.println("Saved Sucessfully>>>>>>>>>>>>>>>>");
				studentTotalScores[i] += studentSubject[i][j];
				studentTotalAverage[i] = (double) studentTotalScores[i] / student;

			if(studentSubject[i][j] > highestScore[j]) highestScore[j] = studentSubject[i][j];
			if(studentSubject[i][j] < lowestScore[j]) lowestScore[j] = studentSubject[i][j];

				if(studentSubject[i][j] <= 50) {
					fail[j]++;}
				if(studentSubject[i][j] > 50) {
				pass[j]++;}
			}
	}


		for(int i = 0; i < subject; i++) {
                      int tot = 0;
                    for(int j = 0; j < student; j++) {
			tot += studentSubject[j][i];
			}
			subjectTotalScores[i] = tot;
			subjectTotalAverage[i] = (double) subjectTotalScores[i] / subject;
			}


	System.out.print("=============================================================================================================================");
		System.out.print("\nSTUDENT\t");
  	for(int i = 0; i < subject; i++) {
		System.out.print("\tSUB" + (i + 1));	
	}

	System.out.print("\tTotal" + "\tAverage");
	System.out.print("\n=============================================================================================================================");

	for(int i = 0; i < student; i++) { 	
	System.out.print("\nStudent\t" + (i + 1)); 
	System.out.print("\nStudent " + (i + 1) + "\t"); 
		for(int j = 0; j < subject; j++) {
		System.out.print(studentSubject[i][j] + "\t");
		}
		System.out.print(studentTotalScores[i] + "\t" + studentTotalAverage[i]);
		System.out.println();
		}

	System.out.print("===============================================================================================================================");


	int pass = 0;
	int fail = 0;

	for(int i = 0; i < student; i++) {

	if(studentSubject[student][subject] <= 50) {
		fail++;}
	if(studentSubject[student][subject] > 50) {
		pass++;}
System.out.println("\n\nSUBJECT SUMMARY");	
for(int i = 0; i < subject; i++) {
	System.out.println("\nSubject " + (i + 1));	
	System.out.println("Highest scoring student is: " +  highestScore[i]);
	System.out.println("Lowest scoring student is: " +  lowestScore[i]);
	System.out.println("Total score is: " +  subjectTotalScores[i]);
	System.out.printf("Average score is: %.2f\n ", subjectTotalAverage[i]);
	System.out.println("Number of Passes: " + pass[i]);
	System.out.println("Number of Fails: " + fail[i]);	


			scanner.close();
}
}