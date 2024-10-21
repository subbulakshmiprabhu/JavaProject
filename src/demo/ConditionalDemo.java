package demo;

public class ConditionalDemo {
	int a = 35 , b =50;
	
	public void ifCheck() {
		if(a>b) {
			System.out.println("if check");
			System.out.println("second line");
		
		}
		
		
		System.out.println("end");
		
		
	}
	
	public void ifelseCheck() {
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
	}
	
	public void nestedIfCheck() {
		if(a>b) {
			if(a>0) {
				if(a!=0) {
					System.out.println("a is not equal to zero");
				}
			}
		}
	}
	
	
	public void ifelseIfLadder() {
		if( a > 40) {
			System.out.println("a is grater than 40");
		}else if(a>30) {
			System.out.println("a is greater than 30");
		}else if(a>20) {
			System.out.println("a is greater than 20");
		}
	}
	
	public void switchSample() {
		String s ="appl";
		//float f = 10.3f;
		switch(s) {
		
		case "banana":
			System.out.println("banana");
			break;
		case "apple":
			System.out.println("apple");
			break;
		case "orange":
			System.out.println("orange");
			break;
		default:
			System.out.println("its not a fruit");
		
		}
	}
	
	public static void main(String[] args) {
		ConditionalDemo demo = new ConditionalDemo();
		demo.ifCheck();
		demo.ifelseCheck();
		demo.nestedIfCheck();
		demo.ifelseIfLadder();
		demo.switchSample();
	}

}
