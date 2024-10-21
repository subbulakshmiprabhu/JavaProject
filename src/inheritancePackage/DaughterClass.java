package inheritancePackage;

public class DaughterClass extends FatherClass {
	
	
	public void laptop() {
		System.out.println("Daughter's laptop");
	}
	
	
	public static void main(String[] args) {
		
		DaughterClass d = new DaughterClass();
		d.laptop();
		d.phone();
		d.bike();
		//d.land();
		//d.house();
		System.out.println(d.money);
		
	}

}
