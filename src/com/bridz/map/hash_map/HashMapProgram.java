package com.bridz.map.hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram {

	public static void main(String args[]) {

		LinkedHashMap linkedHashMap = new LinkedHashMap();

		for (int temporaryValue = 6; temporaryValue >= 1; temporaryValue--) {

			linkedHashMap.put("key" + temporaryValue, temporaryValue);
		}
		
		System.out.println(linkedHashMap);

		Set keySet = linkedHashMap.keySet();
		keySet.forEach(key -> System.out.println(key));

		Collection valuesOfHashMap = linkedHashMap.values();
		valuesOfHashMap.forEach(values -> System.out.println(values));

		Set entrySet = linkedHashMap.entrySet();
		entrySet.forEach(data -> {
			Map.Entry entry = (Entry) data;
			System.out.println("key : " + entry.getKey() + "  " + "values : " + entry.getValue());
		});

		System.out.println(linkedHashMap.containsKey("key1"));
		
		System.out.println(linkedHashMap.containsValue(8));
		
		System.out.println(linkedHashMap.getOrDefault(7, "Key not available"));
		
		System.out.println(linkedHashMap.isEmpty());

		HashMap hashMap2 = (HashMap) linkedHashMap.clone();

		hashMap2.entrySet().forEach(data -> {

			System.out.println(((Entry) data).getKey() + "  " + ((Entry) data).getValue());
		});
	
	}

}
