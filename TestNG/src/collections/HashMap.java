package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {

		java.util.HashMap<Integer, String> hm = new java.util.HashMap<Integer, String>();
		// the value on the zero index is hello
		hm.put(0, "hello");

		hm.put(1, "bye-bye");
		hm.put(2, "morining");
		hm.put(3, "nightnight");

		// if want to print the second value;
		System.out.println(hm.get(1));

		// hm.remove(2)====>remove the value;

		Set st = hm.entrySet();

		Iterator it = st.iterator();

		/// create a hashtable--pass table to the set collection
		// and print the key and value seperatly using iterator;

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}

	}

}
