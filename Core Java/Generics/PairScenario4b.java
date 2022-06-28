package com.assignment.generics;

import java.util.Date;

class pair1<K, V> {
	private K obj1;
	private V obj2;

	public pair1(K obj1, V obj2) {
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

public class PairScenario4b {
	public static void main(String[] args) {
		Date objc = new Date();
		pair1<String, java.util.Date> object = new pair1<String, java.util.Date>("Today is", objc);
		System.out.println("{" + object.getObj1() + " = " + object.getObj2() + "}");
	}
}
