package demo;

public class StudentDetails {
	
	
	int id;   // instance var
	String name;
	static String college;
	static int count =0;
	
	static {
		System.out.println("static block");
		college = "Oranium";
	}
	
	public StudentDetails(int id, String name){
		
		this.id = id;
		this.name = name;		
		count++;
		System.out.println(count);
	}
	
	
	public void display() {
		//this.method();
		sample();
		System.out.println("Name "+ name +"id "+id+"College  "+ college);
	}
	
	public void method() {
		System.out.println("method");
	}
	
	
	public static  void sample() {
		
		//this.method();
		
		System.out.println("static method"+ college);
		
	}
	
	public static void sample(int a) {
		
	}
	
	
	
	
	public static void main(String[] args) {
		StudentDetails s = new StudentDetails(1, "java" );
		s.display();
		StudentDetails s1 = new StudentDetails(2, "javascript" );
		s1.display();
		StudentDetails s2 = new StudentDetails(3, "html" );
		s2.display();
		sample();
		//display();
		
		System.out.println(college);
		
		main(10);
		
	}
	
	
	public static void main(int a) {
		System.out.println("another main method");
	}

}
