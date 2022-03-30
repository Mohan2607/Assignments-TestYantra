package com.tyss.lambdaexpressions;

public class Test {
	public static void main(String[] args) {
		MyFunctionalInterface obj = (x,y) -> {
			return x+y;
			};
		double add = obj.add(10,20);
		System.out.println(add);
	}

}
