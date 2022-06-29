package com.oops.assignment5;

public class Assignment5 {

	public static void main(String[] args) {

		Shape Object1 = new Cube();
		Shape Object2 = new Line();
		Shape Object3 = new Rectangle();

		draw_All(Object1);
		draw_All(Object2);
		draw_All(Object3);
	}

	public static void draw_All(Shape obj) {
		obj.drawShape();
	}

}
