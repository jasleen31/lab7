package com.r094.q1;

public class Arithmetic implements Test{
	int sq;

	@Override
	public void square(int s) {
		// TODO Auto-generated method stub
		sq = s * s;
		
	}
	void display() {
		System.out.println("The square of the number is :" + sq);
	}

}
