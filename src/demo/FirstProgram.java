package demo;

import inheritancePackage.FatherClass;

public class FirstProgram extends FatherClass {
	int sum = 50; // global variable
	int a ;
	float f;
	
	
	private void display() {
		
		final int num =10; // local variable
		
		
		//num= 20;
		
		
		int num1 = 20;
		System.out.println("method display"+ num); //10
		System.out.println("sum"+ sum);
		System.out.println("a value is "+f);
		//byte b= 129;
	}
	
	
	public void display1() {
		int num = 500;
		System.out.println("dispaly1" + num);//500
		System.out.println("sum"+ sum);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		int n ;  //declaration
		String student_Name = "java";  // initialization
		//System.out.println(n);
		System.out.println(student_Name);
		
		FirstProgram demo = new FirstProgram(); // object creation
		
		demo.display();
		demo.display1();
		System.out.println("main sum value"+demo.sum);
		
		
		MethodTypes m = new MethodTypes();
		m.method1();
		
		demo.cloths();
		
		StudentDetails.sample();
		
	}

}
