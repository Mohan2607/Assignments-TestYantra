package com.tyss.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSSet {
	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet();
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);
		hashset.add(40);
		hashset.add(50);

		Iterator<Integer> iterator = hashset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=========================");

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(10);
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(40);
		linkedHashSet.add(50);
		linkedHashSet.add(60);
		Iterator<Integer> iterator2 = linkedHashSet.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

		System.out.println("==========================");

		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(30);
		treeSet.add(20);
		treeSet.add(15);
		treeSet.add(13);
		treeSet.add(17);
		treeSet.add(100);

		Iterator<Integer> iterator3 = treeSet.iterator();
		while (iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
	}

}
