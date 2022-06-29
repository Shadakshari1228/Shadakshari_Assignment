package com.annotations.assignment3;

import java.lang.annotation.Annotation;

public class ExecuteAnnotation {
	public static void main(String[] args) {

		ExecuteDemo ex = new ExecuteDemo();
		ex.myMethod2();
		ex.myMethod1();
		ex.myMethod3();

		Class c = ex.getClass();
		Annotation an = c.getAnnotation(Execute.class);
		Execute e = (Execute) an;
		System.out.println(e.sequence());

	}

}
