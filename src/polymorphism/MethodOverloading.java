package polymorphism;

public class MethodOverloading {
	
	int a =10, b =20;
	
	public void add() {
		
		System.out.println(a+b);
		
	}
	
	public void add(int a) {  //method overloading  // number of arguments
		System.out.println(a+20);
	}
	
	public void add(String a) { //Type
		System.out.println(a+" program");
	}
	
	public void add(int a, float b) {
	System.out.println(a+b);	
	}
	
	public float add(float f , int a) {
		return f+a;  //order of arguments
		
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		
		m.add();
		float sum = m.add(10.5f, 5);
		System.out.println(sum);
		m.add("java ");
		
		m.add(10, 10.5f);
		
	}

}
