package arrays;

public class InterviewMinNumber {

	public static void main(String[] args) {

		/*
		 * 2 4 5
		 * 
		 * 3 4 7
		 * 
		 * 1 2 9
		 */

		int abc[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };
		int min = abc[0][0];
		int mincolomn = 0;
		
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
					mincolomn = j;

				}

			}
		}
		int max = abc[0][mincolomn];
		int k = 0;
		while (k < 3) {
			if (abc[k][mincolomn] > max) {
				max = abc[k][mincolomn];
			}
			k++;
		}
		// System.out.println(min);
	}

}
