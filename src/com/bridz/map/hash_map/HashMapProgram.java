package com.bridz.map.hash_map;

import java.util.HashMap;

public class HashMapProgram {

	public static void main(String args[]) {

		HashMap hashMap = new HashMap();

		for (int i = 1; i < 6; i++) {

			hashMap.put("key" + i, i);
		}

	}

}
