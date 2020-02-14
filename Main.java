/**
 * 
 */
package com.csi.starpattern;

/**
 * @author Ganesh Bidve
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main=new Main();
		pattern();
	}
	
/*	
pattern-1
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * * 
* * * * * * * * * 
* * * * * * * * * *
	 */
	public static void pattern() {
		System.out.println("Pattern-1");
		System.out.println("---------------");
		for(int i=0; i<10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
		/*
Pattern-2
---------------
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * *
	 */
	
	public static void pattern2() {
		System.out.println("Pattern-2");
		System.out.println("---------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
	
		/*
Pattern-3
---------------
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9
	 */
	public static void pattern3() {
		System.out.println("Pattern-3");
		System.out.println("---------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
