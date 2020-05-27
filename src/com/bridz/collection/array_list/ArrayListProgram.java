package com.bridz.collection.array_list;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListProgram {

	public static void main(String args[]) {

		ArrayList arrayList = new ArrayList();
		Vector vector = new Vector();

		for (int i = 1; i <= 5; i++) {

			arrayList.add(i);
			arrayList.add("checking" + i);
			vector.add(i);
			vector.add("checking" + i);

		}

		// Reading each value by using for each
		arrayList.forEach(data -> System.out.print("ArrayList data : " + data + "  "));
		System.out.println();

		// Checking size of arrayList
		System.out.println("ArrayList size : " + arrayList.size());

		// Adding value to arrayList
		arrayList.add(0, 11);
		arrayList.forEach(data -> System.out.print("ArrayList data : " + data + "  "));
		System.out.println();

		// Checkin size of arrayList
		System.out.println("ArrayList size : " + arrayList.size());

		// Removing value from the arrayList
		arrayList.remove(1);
		arrayList.forEach(data -> System.out.print("ArrayList data : " + data + "  "));
		System.out.println();

		// Checking size of arrayList
		System.out.println("ArrayList size : " + arrayList.size());

		// Adding array list collection using add all method
		arrayList.addAll(vector);
		arrayList.forEach(data -> System.out.print("ArrayList data : " + data + "  "));
		System.out.println();

		// Checking value is present or not and setting value
		System.out.println(arrayList.contains(11) + "  " + arrayList.indexOf(11) + "  " + arrayList.set(0, 12) + "  "
				+ arrayList.contains(11));

		// Cloning arrayList
		Object clonedArrayList = arrayList.clone();
		System.out.println(("Cloned arrayList data : " + clonedArrayList + "  "));

		// Checking arrayList is empty or not
		System.out.println(arrayList.isEmpty());
		arrayList.clear();
		System.out.println(arrayList.isEmpty());

		// Converting array list collection to vector
		arrayList = new ArrayList(vector);
		System.out.println(arrayList.isEmpty());
		arrayList.forEach(data -> System.out.print("ArrayList data : " + data + "  "));
		System.out.println();

	}
}
