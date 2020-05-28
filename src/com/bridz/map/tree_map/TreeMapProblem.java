package com.bridz.map.tree_map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapProblem {

	public static void main(String args[]) {

		TreeMap treeMap = new TreeMap();

		for (int temporaryValue = 1; temporaryValue < 6; temporaryValue++) {

			treeMap.put("key" + temporaryValue, temporaryValue);
		}

		System.out.println(treeMap);

		System.out.println(treeMap.firstKey());

		System.out.println(treeMap.lastKey());

		System.out.println(treeMap.ceilingKey("key3"));

		System.out.println(treeMap.floorKey("key3"));

		System.out.println(treeMap.lowerKey("key3"));

		System.out.println(treeMap.higherKey("key3"));

		System.out.println(treeMap.descendingKeySet());

		Set keySet = treeMap.keySet();
		keySet.forEach(key -> System.out.println(key));

		Collection valuesOfHashMap = treeMap.values();
		valuesOfHashMap.forEach(values -> System.out.println(values));

		Set entrySet = treeMap.entrySet();
		entrySet.forEach(data -> {
			Map.Entry entry = (Entry) data;
			System.out.println("key : " + entry.getKey() + "  " + "values : " + entry.getValue());
		});

		System.out.println(treeMap.containsKey("key1"));

		System.out.println(treeMap.containsValue(8));

		System.out.println(treeMap.isEmpty());

		TreeMap hashMap3 = (TreeMap) treeMap.clone();

		hashMap3.entrySet().forEach(data -> {

			System.out.println(((Entry) data).getKey() + "  " + ((Entry) data).getValue());
		});
	}
}
