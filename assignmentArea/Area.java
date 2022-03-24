package com.tyss.assignmentArea;

public class Area extends Shape{
	
	@Override
	public void RectangleArea(int length, int breadth) {
		System.out.println("The area of rectangle is:"+ length*breadth);
	}
	
	@Override
	public void SquareArea(int side) {
		System.out.println("The area of square is :"+ side*side);
	}
	
	@Override
	public  void CircleArea(int radius) {
		System.out.println("The area of circle is :" + 3.14*(radius*radius));
	}

}
