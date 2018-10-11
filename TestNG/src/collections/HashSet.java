
package collections;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {

		// HashSet TreeSet LinkHashSet implements Set interface.

		// Set interface does NOT accept duplicated values.

		// there is no guarentee elements stored in sequential order.
		// random order.

		/*
		 * HashSet<String> hs = new HashSet<String>(); when we press hs. there will be
		 * some method we can use. hs.add===> can add the values. but when we added two
		 * same values its not gonna print both of them. hs.remove; give the string that
		 * we want to remove; hs.isEmpty===> check if the list is empty of not;
		 * hs.size();
		 * 
		 */

		java.util.HashSet<String> hs = new java.util.HashSet<String>();

		hs.add("USA");
		hs.add("UK");
		hs.add("URUMQI");
		hs.add("he");
		hs.add("she");
		hs.add("she");

		System.out.println(hs);

		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		// check if the next is present or not;hasNext;
		// till everything will present it will iterat through and print it all;
		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
