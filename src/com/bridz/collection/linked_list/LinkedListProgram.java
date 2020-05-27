package com.bridz.collection.linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListProgram {

	public static void main(String args[]) {

		LinkedList linkList = new LinkedList();
		ArrayList arrayList = new ArrayList();
		Vector vector = new Vector();

		for (int i = 1; i <= 5; i++) {

			linkList.add(i);
			linkList.add("checking" + i);

			vector.add(i);
			vector.add("checking" + i);

			arrayList.add(i);
			arrayList.add("checking" + i);
		}

		// Reading each value by using for each
		linkList.forEach(data -> System.out.print("LinkList data : " + data + "  "));
		System.out.println();

		// Checking size of link list
		System.out.println("LinkList size : " + linkList.size());

		// Adding value to link list
		linkList.add(0, 11);
		linkList.forEach(data -> System.out.print("LinkList data : " + data + "  "));
		System.out.println();

		// Checking size of linkList
		System.out.println("LinkList size : " + linkList.size());

		// Removing value from the link list
		linkList.remove(1);
		linkList.forEach(data -> System.out.print("LinkList data : " + data + "  "));
		System.out.println();

		// Checking size of linkList
		System.out.println("LinkList size : " + linkList.size());

		// Adding array list collection using add all method
		linkList.addAll(arrayList);
		linkList.forEach(data -> System.out.print("LinkList data : " + data + "  "));
		System.out.println();

		// Checking value is present or not and setting value
		System.out.println(linkList.contains(11) + "  " + linkList.indexOf(11) + "  " + linkList.set(0, 12) + "  "
				+ linkList.contains(11));

		// Cloning linkList
		Object clonedLinkList = linkList.clone();
		System.out.println(("Cloned linkList data : " + clonedLinkList + "  "));

		// Checking link list is empty or not
		System.out.println(linkList.isEmpty());
		linkList.clear();
		System.out.println(linkList.isEmpty());

		// Converting vector collection to link list
		linkList = new LinkedList(vector);
		System.out.println(linkList.isEmpty());
		linkList.forEach(data -> System.out.print("linkList data : " + data + "  "));
		System.out.println();

		// Converting array list collection to link list
		linkList = new LinkedList(arrayList);
		System.out.println(linkList.isEmpty());
		linkList.forEach(data -> System.out.print("linkList data : " + data + "  "));
		System.out.println();

	}

}
