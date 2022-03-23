package com.tyss.interfaceclass;

public class Casio implements Calculator {
	
	@Override
	public int add(int x,int y) {
		return x+y;
	}
	
	@Override
	public int sub(int x,int y) {
		return x-y;
	}
	
	@Override
	public int multiple(int x,int y) {
		return x*y;
	}
	
	@Override
	public int division(int x,int y) {
		return x/y;
	}
	

}