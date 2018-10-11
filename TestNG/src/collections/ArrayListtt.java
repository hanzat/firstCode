package collections;

/*
The Java Collections Fremework :::::::
Is a collection of interfaces and classes which helps in 
Storing and processing the data efficiently.
This framework has several useful classes which 
Have tons of useful functions which makes a programmer
Task super easy.*/

/*Collection
(list,set,hashmap.)
List  :
A list is an ordered collection(sometimes callsd
A sequence).lists may contain duplicate elements.
Below are classes implement list interface :
1>	Arraylist      
2>	 Linkedlist
3>	Vector*/

import java.util.ArrayList;

public class ArrayListtt {

	public static void main(String[] args) {

		// declare a class;
		
		ArrayList<String> a = new ArrayList<String>();

		a.add("annie");
		a.add("mia");

		// int arrey you have to defind the size. its fixed.
		// while in arrayList its dinamic.(besic different.)
		System.out.println(a);

		a.add(0, "student");

		System.out.println(a);

		/*
		 * // you can add(remove) the string by giving the index number. //can remove by
		 * string also by giving the string you want to remove. a.remove("student");
		 * a.remove(1); System.out.println(a);
		 * 
		 * // if i want it empty.just remove it all;
		 * 
		 */
		// if simply want to print the particular value;
		System.out.println(a.get(0));

		// if want to know some particular word is present in the list or not;

		System.out.println(a.contains("testing"));

		// if want to know what is the index of particular string.

		System.out.println(a.indexOf("annie"));

		// check if the array is empty;
		System.out.println(a.isEmpty());

		// if we want to know the size of the arraylist;

		System.out.println(a.size());

	}

}
