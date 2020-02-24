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
	
		/*
Pattern-4
--------------
0 0 0 0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 1 
2 2 2 2 2 2 2 2 2 2 
3 3 3 3 3 3 3 3 3 3 
4 4 4 4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5 5 
6 6 6 6 6 6 6 6 6 6 
7 7 7 7 7 7 7 7 7 7 
8 8 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 9 
	 */
	public static void pattern4() {
		System.out.println("Pattern-4");
		System.out.println("--------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
		
	/*
	 * Pattern-5
--------------
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 
	 */
	public static void pattern5() {
		System.out.println("Pattern-5");
		System.out.println("--------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print((9 - j) + " ");
			}
			System.out.println();
		}
	}
	
	/*
	 * Pattern-6
--------------
9 9 9 9 9 9 9 9 9 9 
8 8 8 8 8 8 8 8 8 8 
7 7 7 7 7 7 7 7 7 7 
6 6 6 6 6 6 6 6 6 6 
5 5 5 5 5 5 5 5 5 5 
4 4 4 4 4 4 4 4 4 4 
3 3 3 3 3 3 3 3 3 3 
2 2 2 2 2 2 2 2 2 2 
1 1 1 1 1 1 1 1 1 1 
0 0 0 0 0 0 0 0 0 0
	 */
	public static void pattern6() {
		System.out.println("Pattern-6");
		System.out.println("--------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print((9 - i) + " ");
			}
			System.out.println();
		}
	}
	
	/*
	 * Pattern-7
--------------
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J
	 */
	public static void pattern7() {
		System.out.println("Pattern-7");
		System.out.println("--------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print((char) (65 + j) + " ");
			}
			System.out.println();
		}
	}
	
	/*
	 * Pattern-8
--------------
A A A A A A A A A A 
B B B B B B B B B B 
C C C C C C C C C C 
D D D D D D D D D D 
E E E E E E E E E E 
F F F F F F F F F F 
G G G G G G G G G G 
H H H H H H H H H H 
I I I I I I I I I I 
J J J J J J J J J J 
	 */
	public static void pattern8() {
		System.out.println("Pattern-8");
		System.out.println("--------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print((char) (65 + i) + " ");
			}
			System.out.println();
		}
	}
	
		/*
	 * Pattern-9
--------------
J I H G F E D C B A 
J I H G F E D C B A 
J I H G F E D C B A 
J I H G F E D C B A 
J I H G F E D C B A 
J I H G F E D C B A 
J I H G F E D C B A 
J I H G F E D C B A 
J I H G F E D C B A 
J I H G F E D C B A 
	 */
	public static void pattern9() {
		System.out.println("Pattern-9");
		System.out.println("--------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print((char) (74 - j) + " ");
			}
			System.out.println();
		}
	}
}
