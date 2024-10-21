package demo;

public class LoopingDemo {

	public void whileDemo() {
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println("end");

	}
	
	public void doWhile() {
		int i =1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
	}
	
	
	public void forLoop() {
		
		System.out.println("for lopp***************");
		
		for(int i = 1; i<=10 ; i++) {
			if(i ==  5) {
			//	break;
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("end");
	}
	
	

	public static void main(String[] args) {
		LoopingDemo demo = new LoopingDemo();
		//demo.whileDemo();
		//demo.doWhile();
		demo.forLoop();
	}
}
