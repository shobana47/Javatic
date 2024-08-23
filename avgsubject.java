public class avgsubject {
	public static void main(String[] args) {
			int[][] scores = { {85, 78, 90, 88}, {76, 85, 83, 80}, {91, 89, 92, 94} };
			System.out.println("Average scores for each student:");
			
			for (int i = 0; i < 3; i++){
				int sum = 0;
				for (int j = 0; j < 4; j++)
					sum += scores[i][j];
					float avg = (float) sum / 4;
					System.out.print( "Student " + (i+1) + ": " + avg + "\n");
			}

			System.out.println("Average scores for each subject:");
			
			int math_sum = 0;
			for (int i = 0; i < 3; i++){
				math_sum += scores[i][0];
			}
			float math_avg = (float) math_sum / 3;
			System.out.println("Math Average: " + math_avg);

			int science_sum = 0;
			for (int i = 0; i < 3; i++){
				science_sum += scores[i][1];
			}
			float science_avg = (float) science_sum / 3;
			System.out.println("Science Average: " + science_avg);

			int english_sum = 0;
			for (int i = 0; i < 3; i++){
				english_sum += scores[i][2];
			}
			float english_avg = (float) english_sum / 3;
			System.out.println("English Average: " + english_avg);

			int history_sum = 0;
			for (int i = 0; i < 3; i++){
				history_sum += scores[i][3];
			}
			float history_avg = (float) history_sum / 3;
			System.out.println("History Average: " + history_avg);

	}
}