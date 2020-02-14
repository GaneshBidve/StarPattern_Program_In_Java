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
}
