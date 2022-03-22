package com.tyss.overriding2;

public class Owner {
	public static void main(String[] args) {
		Ferrari ferrari=new Ferrari();
		ferrari.drive();
		ferrari.brake();
		ferrari.horn();
		
		System.out.println("========");
		Audi audi=new Audi();
		audi.brake();
		audi.drive();
	}

}
