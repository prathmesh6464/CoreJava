package com.bridz.map.hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram {

	public static void main(String args[]) {

		HashMap hashMap = new HashMap();

		for (int i = 1; i < 6; i++) {

			hashMap.put("key" + i, i);
		}

		Set keySet = hashMap.keySet();
		keySet.forEach(key -> System.out.println(key));

		Collection valuesOfHashMap = hashMap.values();
		valuesOfHashMap.forEach(values -> System.out.println(values));

		Set entrySet = hashMap.entrySet();
		entrySet.forEach(data -> {
			Map.Entry entry = (Entry) data;
			System.out.println("key : " + entry.getKey() + "  " + "values : " + entry.getValue());
		});

		System.out.println(hashMap.containsKey("key1"));
		
		System.out.println(hashMap.containsValue(8));
		
		System.out.println(hashMap.getOrDefault(7, "Key not available"));
		
		System.out.println(hashMap.isEmpty());

		HashMap hashMap2 = (HashMap) hashMap.clone();

		hashMap2.entrySet().forEach(data -> {

			System.out.println(((Entry) data).getKey() + "  " + ((Entry) data).getValue());
		});
	}

}
