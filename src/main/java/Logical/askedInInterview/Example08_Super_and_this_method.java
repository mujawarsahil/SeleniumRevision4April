package Logical.askedInInterview;

public class Example08_Super_and_this_method extends superClass{
	
	public Example08_Super_and_this_method() {
		//2) if we need to run parameterized constructor we need to call from without parameter constructor
		//this(10);// this statement is calling int parameter constructor
		
		//3) now we want to run parameterized constructor of supper class
		super(20);
		System.out.println("Running without parameter Constructor");
	
	}
	public Example08_Super_and_this_method(int a)
	{
		System.out.println("Running int parameter Constructor");
	}

	public static void main(String[] args) {
		
		Example08_Super_and_this_method e=new Example08_Super_and_this_method();//1) after object creation without paramenter
		//constructor is running by default 
	}
}

class superClass{
	
	public superClass() {
	
	  System.out.println("This is without parameter constructor of super class!!");
	}
	
	public superClass(int b) {
		
		  System.out.println("This is  parameterized constructor of super class!!");
		}
}