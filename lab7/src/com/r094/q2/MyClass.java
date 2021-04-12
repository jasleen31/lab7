package com.r094.q2;
public class MyClass implements A{
	int m1;
	int m2;

	@Override
	public void meth1(int a) {
		// TODO Auto-generated method stub
		m1 = a*10;
		System.out.println("Meth1-->"+ m1 );
	}
	@Override
	public void meth2(int b) {
		// TODO Auto-generated method stub
		m2 = b/10;
		System.out.println("Meth2-->"+ m2 );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		obj.meth1(6);
		obj.meth2(500);
	}
}
