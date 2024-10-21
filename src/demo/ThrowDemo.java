package demo;

public class ThrowDemo {
	
	
	public void method() {
		System.out.println("inside method");
		int age = 2;
		
		if(age < 18) {
		throw new ArithmeticException("age is less than 18");
		}
		
		//System.out.println("end");
	}
	
	public static void main(String[] args) {
		
		
		ThrowDemo t = new ThrowDemo();
		t.method();
		
		System.out.println("end");
		
	}

}
