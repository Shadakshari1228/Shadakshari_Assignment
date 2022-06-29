package com.annotations.assignment3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@interface Execute {
	int sequence() default 0;

}

@Execute
class ExecuteDemo {

	@Execute(sequence = 2)
	public void myMethod1() {
		System.out.println("MyMethod1 Executed");
	}

	@Execute(sequence = 1)
	public void myMethod2() {
		System.out.println("MyMethod2 Executed");
	}

	@Execute(sequence = 3)
	public void myMethod3() {
		System.out.println("MyMethod3 Executed");
	}
}
