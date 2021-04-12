package com.r094.q3;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotUsingConstVal obj1 = new NotUsingConstVal();
		UsingConstVal obj2 = new UsingConstVal();
		Sample sp;
		sp = obj1;
		System.out.println("Sum of A & B = " + 
							sp.sum(10, 20));
		sp = obj2;
		System.out.println("Sum of A, B & constant Value = " + 
							sp.sum(10, 20));

	}

}

