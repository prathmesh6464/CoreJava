package com.bridz.collection.linked_hash_set;

import java.util.LinkedHashSet;
import java.util.Vector;

public class LinkedHashSetProgram {

	public static void main(String args[]) {

		LinkedHashSet linkedHashSet = new LinkedHashSet();
		Vector vector = new Vector();

		for (int temporaryValue = 1; temporaryValue < 6; temporaryValue++) {

			linkedHashSet.add(temporaryValue);
			vector.add(temporaryValue);
		}

		// Showing set in order
		linkedHashSet.forEach(data -> System.out.print(data + "   "));
		System.out.println();

		System.out.println(linkedHashSet.remove(1));

		System.out.println(linkedHashSet.size());

		System.out.println(linkedHashSet.isEmpty());

		LinkedHashSet linkedHashSet2 = (LinkedHashSet) linkedHashSet.clone();
		linkedHashSet2.forEach(data -> System.out.print(data + "   "));
		System.out.println();

		// Converting vector in linked hash set
		linkedHashSet2 = new LinkedHashSet<>(vector);
		linkedHashSet2.forEach(data -> System.out.print(data + "   "));
		System.out.println();

	}

}
