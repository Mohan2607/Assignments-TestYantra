package com.tyss.overriding2;

public class Audi extends Car{
	@Override
	public void brake() {
		System.out.println("new brake is installed");
	}

}
