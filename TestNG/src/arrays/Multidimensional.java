package arrays;

public class Multidimensional {

	public static void main(String[] args) {

		/// x is row. y is column.
		//// a[row][colomn];
		/*
		 * 2 4 5
		 * 
		 * 3 4 7
		 */

		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		
		// System.out.println(a[1][0]);

		// we can also create the arry like this:
		// int b[][]={{2,3,5,6}{6,8,9,8}};

		// how to print out all the values.

		for (int i = 0; i < 2; i++) { // row.
			for (int j = 0; j < 3; j++) { /// column.
				System.out.println(a[i][j]);
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}
}
