package demo;

public final class ImmutableDemo {
	
	private final int a = 10;
	
	private void display() {
		System.out.println(a); 
	}
	
	public static void main(String[] args) {
		ImmutableDemo demo = new ImmutableDemo();
		demo.display();
	}

}
