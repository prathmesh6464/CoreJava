package com.bridz.collection.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorProgram {

	public static void main(String args[]) {

		Vector vector = new Vector();
		ArrayList arrayList = new ArrayList();

		for (int temporaryValue = 1; temporaryValue <= 5; temporaryValue++) {

			vector.add(temporaryValue);
			vector.add("checking" + temporaryValue);
			arrayList.add(temporaryValue);
			arrayList.add("checking" + temporaryValue);

		}

		// Reading each value by using for each
		vector.forEach(data -> System.out.print("Vector data : " + data + "  "));
		System.out.println();

		// Checking capacity and size of vector
		System.out.println("Vector capacity : " + vector.capacity() + "   " + "Vector size : " + vector.size());

		// Adding value to vector
		vector.add(0, 11);
		vector.forEach(data -> System.out.print("Vector data : " + data + "  "));
		System.out.println();

		// Checking capacity and size of vector
		System.out.println("Vector capacity : " + vector.capacity() + "   " + "Vector size : " + vector.size());

		// Removing value from the vector
		vector.remove(1);
		vector.forEach(data -> System.out.print("Vector data : " + data + "  "));
		System.out.println();

		// Checking capacity and size of vector
		System.out.println("Vector capacity : " + vector.capacity() + "   " + "Vector size : " + vector.size());

		// Adding array list collection using add all method
		vector.addAll(arrayList);
		vector.forEach(data -> System.out.print("Vector data : " + data + "  "));
		System.out.println();

		// Checking value is present or not and setting value
		System.out.println(vector.contains(11) + "  " + vector.indexOf(11) + "  " + vector.set(0, 12) + "  "
				+ vector.contains(11));

		// Cloning vector
		Object clonedVector = vector.clone();
		System.out.println(("Cloned vector data : " + clonedVector + "  "));

		// Checking vector is empty or not
		System.out.println(vector.isEmpty());
		vector.clear();
		System.out.println(vector.isEmpty());

		// Converting array list collection in vector
		vector = new Vector(arrayList);
		System.out.println(vector.isEmpty());
		vector.forEach(data -> System.out.print("Vector data : " + data + "  "));
		System.out.println();

	}

}
