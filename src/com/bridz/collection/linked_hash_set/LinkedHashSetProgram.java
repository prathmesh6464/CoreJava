package com.bridz.collection.linked_hash_set;

import java.util.LinkedHashSet;
import java.util.Vector;

public class LinkedHashSetProgram {

	public static void main(String args[]) {

		LinkedHashSet linkedHashSet = new LinkedHashSet();
		Vector vector = new Vector();

		for (int i = 1; i < 6; i++) {

			linkedHashSet.add(i);
			vector.add(i);
		}

		// Showing set in order
		linkedHashSet.forEach(data -> System.out.print(data + "   "));
		System.out.println();
		
		LinkedHashSet linkedHashSet2 = (LinkedHashSet) linkedHashSet.clone();
		linkedHashSet2.forEach(data -> System.out.print(data + "   "));
		System.out.println();
		
		linkedHashSet2 = new LinkedHashSet<>(vector);
		linkedHashSet2.forEach(data -> System.out.print(data + "   "));
		System.out.println();
		
	}

}
