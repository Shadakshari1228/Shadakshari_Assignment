package com.annotations.assignment1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Test {
	int test_case() default 10;
}

@Test
class TestDemo {
	int a;
	int b;

	public TestDemo(int a, int b) {

		this.a = a;
		this.b = b;
	}

	public void test1() {
		System.out.println("Test()-1");
	}

	public void test2() {
		System.out.println("Test()-2");
	}

}