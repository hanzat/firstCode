package oopsConcept;

public class StringHandling {

	public static void main(String[] args) {

		String str = "Payment $100 paid";
		/////// print the $ in the consule.
		System.out.println(str.charAt(8));

		/// print the index of the text where we have $

		String str1 = "Payments $100 paid";

		System.out.println(str1.indexOf("$"));

		//// print the text with uppercase or lower case .

		System.out.println(str1.toUpperCase());

		///// only print the text that from the $ .
		/// use the subStirng and give the index number where you want to started.

		System.out.println(str1.substring(8));
		System.out.println(str1.subSequence(8, 15));
		// print the string in reverse.

		/*
		 * String h = "HanZat";
		 * 
		 * for (int i = h.length() - 1; i >= 0; i--) {
		 * 
		 * System.out.println(h.charAt(i));
		 * 
		 * }
		 */

		/// IF WE WANT TO COMPARE THR REVERSE STRING IS SAME
		// EX: MADAM---REVERSE IS ALSO MADAM;
		// WE WANT TO COMPARE THE T AND H;

		String h = "HanZat";
		String t = " ";
		for (int i = h.length() - 1; i >= 0; i--) {

			t = t + h.charAt(i);

		}

		System.out.println(t);

		if (h == t) {

		}

	}

}
