package com.r094.q4;

public class Student implements DivMod{
	String name;
	int div,mod;
	void name(String n) {
		name = n;
	}
	@Override
	public void division(int a) {
		// TODO Auto-generated method stub
		div = a;
	}

	@Override
	public void modules(int b) {
		// TODO Auto-generated method stub
		mod = b;
	}
	void display() {
		System.out.println("Name--> "+ name);
		System.out.println("Division--> "+ div);
		System.out.println("Modules--> "+ mod);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.name("Alex");
		st.division(15);
		st.modules(8);
		st.display();
	}
}
