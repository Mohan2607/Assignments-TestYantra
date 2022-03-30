package com.tyss.exerciseoninterface;

public interface Test {
	
	 default void message() {
		 System.out.println("Hii");
	 }

}
