package demo;

public class OperatorDemo {
	
	int a =50, b =20;
	
	
	public void arithmeticOpertor() {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);  // quotient
		System.out.println(a%b);  //remainder
		
	}
	
	public void relationalOperator() {
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a != b);
		
	}
	
	public void logicalOperator() {
		System.out.println(a>b && a<0);
		System.out.println(a>b || a<0);
		System.out.println(!( a>b));
	}
	
	public void conditionalOp() {
		//(condition)? "Statement" : "statement" ;
		String result = (a>b)? "a is greater than b" :"a is lesser than b";
		System.out.println(result);
		
		
	}
	
	public void incDemo() {
	//	a = a+1; 
		
		System.out.println(a++);  //post //51
		
		System.out.println(++a);  //52
		
		System.out.println(a--);  //52  //51
		
		System.out.println(--a);  //50
	}
	
	public void concatOp() {
		String s ="welcome " , s1 = "java";
		System.out.println(s+s1+ "50" + a);
	}
	
	public static void main(String[] args) {
		
		OperatorDemo demo = new OperatorDemo();
		demo.arithmeticOpertor();
		demo.relationalOperator();
		demo.logicalOperator();
		demo.conditionalOp();
		demo.incDemo();
		demo.concatOp();
		
	}

}
