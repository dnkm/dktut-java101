package com.dktut.java201.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Mike", 23);
		scores.put("Scott", 33);
		scores.put("Dennis", 91);

		System.out.println(scores.get("Mike"));

		for (Map.Entry<String, Integer> entry : scores.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
