package inheritancePackage;

import abstraction.Father;

public class SonClass extends FatherClass{
	int money = 10000;
	
	public SonClass() {
		super(10);
		//default parent constructor
		System.out.println("son constructor");
	}
	
	public void car() {
		System.out.println("Son's car");
	}
	
	public static void bike() {
	//super.phone();
		System.out.println("Son's bike");
	}
	
	public void cloths() {
		super.cloths();
		System.out.println("son's cloths"+super.money);
	}
	
	
	
	public static void main(String[] args) {
		SonClass s = new SonClass();
		s.car();
		s.bike();
		s.phone();
		s.cloths();
		
		FatherClass f = new FatherClass();
		
		FatherClass f1= new SonClass();
		f1.cloths();
		f1.bike();
		
		
		
		
	}
	

}
