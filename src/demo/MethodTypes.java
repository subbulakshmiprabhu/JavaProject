package demo;

public class MethodTypes {
	
	
	
	
	public void method1() {
		System.out.println("method1");
		
	  this.add("java" , 10);
	}
	
	
	
	public void add(String num1, int num2) {
		
		System.out.println(num1+num2);
		
	}
	
	
	
	public int sub() {
		
		
		int sub = 50-20;
		return sub;
		
	}
	
	public int mul(int num1, int num2) {
		
		
		return num1*num2;
		
	}
	
	
	public static void main(String[] args) {
		MethodTypes m= new MethodTypes();
		m.method1();
		m.add("10", 10);
		//int sub = m.sub();
		System.out.println(m.sub());
		System.out.println(m.mul(10, 5));
		
	}

}
