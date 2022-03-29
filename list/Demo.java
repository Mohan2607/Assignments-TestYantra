package com.tyss.list;

import java.util.List;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);

		List l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		
		list.addAll(l);
		System.out.println(list);
		
		List li=new ArrayList();
		li.add(100);
		li.add(200);
		
		list.removeAll(li);
		System.out.println(list);
	}

}
