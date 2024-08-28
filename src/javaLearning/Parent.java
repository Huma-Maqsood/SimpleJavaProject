package javaLearning;

public class Parent {
	
	int m = 50; // instance variable

	public static void main(String[] args) {
		Child obj = new Child();
		obj.add();
		//Child.display(); // static variable
		Parent parent = new Parent();// created an instance to print the value of instance variable
		System.out.println(parent.m);
	}

}
