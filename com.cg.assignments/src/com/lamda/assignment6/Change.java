package com.lamda.assignment6;

import java.util.function.UnaryOperator;

class Change implements UnaryOperator<String> {
	@Override
	public String apply(String s) {
		return s.toUpperCase();
	}
}
