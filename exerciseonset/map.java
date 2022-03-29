package com.tyss.exerciseonset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class map {
	public static void main(String[] args) {
		HashMap<String, Long> Map = new HashMap();
		Map.put("Mohan", 9966778855l);
		Map.put("Sasi", 9966778855l);
		Map.put("Moha", 9966778855l);
		Map.put("Sasidharan", 9966778855l);
		Map.put("Naveen", 9966778855l);

		Set<String> keySet = Map.keySet();
		for (String name : keySet) {
			System.out.println(name + " " + Map.get(name));
		}
		System.out.println("============");
		Set<Entry<String, Long>> entrySet = Map.entrySet();

		Iterator<Entry<String, Long>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		} 
	}

}
