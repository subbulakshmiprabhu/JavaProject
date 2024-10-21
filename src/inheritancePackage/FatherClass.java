package inheritancePackage;

public class FatherClass {
	
	
	public FatherClass() {
		System.out.println("father class");
	}
	
	public FatherClass(int a) {
		System.out.println("father   ::"+a);
	}
	
	 int money  = 50000;
	
	public static void bike() {
		final int a = 1000;
	//	a = 10;
		System.out.println("Father's bike");
	}
	
	public final void phone() {
		System.out.println("Father's phone");
		
	}

	protected void cloths() {
		System.out.println("father's cloths");
	}

	
	public static void main(String[] args) {
		FatherClass f = new FatherClass();
		f.bike();
		f.phone();
		
	}
}
