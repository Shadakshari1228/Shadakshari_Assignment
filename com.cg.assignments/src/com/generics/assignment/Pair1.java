package com.generics.assignment;

class Pair1<K, V> {
	private K obj1;
	private V obj2;

	public Pair1(K obj1, V obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public K getObj1() {
		return obj1;
	}

	public V getObj2() {
		return obj2;
	}

}