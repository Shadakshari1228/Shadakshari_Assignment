package com.annotations.assignment1;

import java.lang.annotation.Annotation;

public class TestAnnotation {
	public static void main(String[] args) {

		TestDemo t = new TestDemo(10, 20);
		t.test1();
		t.test2();

		Class c = t.getClass();
		Annotation an = c.getAnnotation(Test.class);
		Test ts = (Test) an;
		System.out.println(ts.test_case());
	}

}
