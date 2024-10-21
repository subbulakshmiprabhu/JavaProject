package demo;

public class ConstructorDemo {
	int a ;
	String name ;
	
	public  ConstructorDemo() {  // default constructor
		this(20, "html");
		System.out.println("inside constructor");
	}
	
	public ConstructorDemo(int a, String name) {
		this("javascript");//constructor overloading
		this.a =a;
		this.name = name;
		System.out.println(a);
		System.out.println(this.name);
	}
	
	public ConstructorDemo(String name) {
		System.out.println("3rd construcor");
	}
	
	
	
	public static void main(String[] args) {
		ConstructorDemo demo = new ConstructorDemo();
		
	//	ConstructorDemo demo1= new ConstructorDemo(10, "java");
		
		
		
		
	}

}
