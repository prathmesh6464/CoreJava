package com.bridz.collection.tree_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetProblem {

	public static void main(String args[]) {

		TreeSet treeSet = new TreeSet();
		HashSet hashSet = new HashSet();

		for (int i = 1; i < 6; i++) {
			treeSet.add(i);
			hashSet.add(i + 5);
		}

		// Reading data from tree set
		treeSet.forEach(data -> System.out.print(data + "  "));
		System.out.println();

		treeSet.remove(2);
		treeSet.forEach(data -> System.out.print(data + "  "));
		System.out.println();

		System.out.println(treeSet.first());

		System.out.println(treeSet.last());

		System.out.println(treeSet.headSet(2));

		System.out.println(treeSet.tailSet(2));

		treeSet.addAll(hashSet);
		treeSet.forEach(data -> System.out.print(data + "  "));
		System.out.println();

		treeSet.removeAll(hashSet);
		treeSet.forEach(data -> System.out.print(data + "  "));
		System.out.println();

		treeSet.addAll(hashSet);
		treeSet.forEach(data -> System.out.print(data + "  "));
		System.out.println();

		treeSet.retainAll(hashSet);
		treeSet.forEach(data -> System.out.print(data + "  "));
		System.out.println();

		// Converting hash set to tree set
		TreeSet treeSet2 = new TreeSet(hashSet);
		treeSet2.forEach(data -> System.out.print(data + "  "));
		System.out.println();

	}
}
