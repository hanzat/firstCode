package arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		/// a container which stores multiple
		// values of same data types.

		int a[] = new int[5]; // declare an array and allocates memory for the values.

		a[0] = 2;
		a[1] = 4;
		a[2] = 2;
		a[3] = 2;
		a[4] = 6;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		int b[] = { 2, 4, 2, 2, 6 };
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		
		
		
	}

}
