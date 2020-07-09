package com.csi.pattern;

public class Test {

	public void pattern() {
		System.out.println("Pattern-1");
		System.out.println("---------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
