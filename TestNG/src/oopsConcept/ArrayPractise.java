package oopsConcept;

public class ArrayPractise {

	public static void main(String[] args) {
		//// Sum of numbers in the array.
		int sum = 0;
		int c[] = { 2, 5, 8, 7, 4 };
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]); // this will print everything in array

			sum = sum + c[i];

		}
		System.out.println(sum);
	}

}
