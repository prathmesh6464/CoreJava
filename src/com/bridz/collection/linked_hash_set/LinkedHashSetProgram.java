package com.bridz.collection.linked_hash_set;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

	public static void main(String args[]) {

		LinkedHashSet linkedHashSet = new LinkedHashSet();

		for (int i = 1; i < 6; i++) {

			linkedHashSet.add(i);
		}

		linkedHashSet.forEach(data -> System.out.print(data + "   "));
		System.out.println();
		
		System.out.println(linkedHashSet);
	}

}
