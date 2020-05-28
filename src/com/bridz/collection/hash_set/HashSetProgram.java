package com.bridz.collection.hash_set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetProgram {

	public static void main(String args[]) {

		HashSet hashSet = new HashSet();
		ArrayList arrayList = new ArrayList();

		System.out.println(hashSet.add("hi")); // true
		System.out.println(hashSet.add("hi")); // false (duplicate values are not allowed)
		System.out.println(hashSet.add(null));   

		for (int temporaryValue = 1; temporaryValue < 6; temporaryValue++) {
			hashSet.add(temporaryValue);
			arrayList.add(temporaryValue + 5);
		}

		HashSet hashSet2 = (HashSet) hashSet.clone();
		hashSet2.forEach(data -> System.out.print(data + "  "));
		System.out.println();

		System.out.println(hashSet.size());

		System.out.println(hashSet.contains(null));

		System.out.println(hashSet.isEmpty());

		System.out.println(hashSet.equals(arrayList));

		System.out.println(hashSet.containsAll(arrayList));

		hashSet.addAll(arrayList);
		hashSet.forEach(data -> System.out.print(data + "  "));
		System.out.println();

		hashSet.remove(null);
		System.out.println(hashSet.contains(null));

		System.out.println(hashSet.containsAll(arrayList));

		hashSet.removeAll(arrayList);

		System.out.println(hashSet.containsAll(arrayList));
		hashSet.forEach(data -> System.out.print(data + "  "));
		System.out.println();

		hashSet.retainAll(arrayList);
		hashSet.forEach(data -> System.out.print(data + "  "));
		System.out.println();

		// Converting array list to hashset
		hashSet = new HashSet(arrayList);
		hashSet.forEach(data -> System.out.print(data + "  "));
		System.out.println();

		hashSet.addAll(hashSet2);
		hashSet.forEach(data -> System.out.print(data + "  "));
		System.out.println();

		hashSet.retainAll(arrayList);
		hashSet.forEach(data -> System.out.print(data + "  "));
		System.out.println();
	}

}
