package collections;

import java.util.ArrayList;

public class UnicArrayList {

	public static void main(String[] args) {

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		// the requirement is to check this arraylist
		// print the unique number
		// and print how many time its repeated;

		// create an empty arraylist first;

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) // add nagation infront to go inside the if loop;
			{
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				// as the result we can seee that 9 is the unique number cause k is only 1;
				//so we can pritn 9 with if loop;
				
				if(k==1) {
					System.out.println("the unique number is    "  +  a[i]);
				}
					
				
			}
		}

	}

}
