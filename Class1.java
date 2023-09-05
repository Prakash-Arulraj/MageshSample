package org.difpack;

//import packagename.ClassName;
import org.practice.*;



public class Class1 {
	
	public void fatheName() {
		System.out.println("Father Name is Rengaraj");

	}
	
	public void motherName() {
		System.out.println("Mother Name is Mahalakshmi");

	}
	
	public static void main(String[] args) {
		Class1 s = new Class1();
		s.fatheName();
		s.motherName();
		
		//call the diff package methods using import 
		ParentClass op1 = new ParentClass();
		op1.fName();
		op1.lName();
		
		ChildClass op2 = new ChildClass();
		op2.place();
		op2.degree();
		
		System.out.println("This is Other Package");
		
	}

}
