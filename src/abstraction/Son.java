package abstraction;

public class Son  implements Father, Mother{

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		
		System.out.println("Son's phone");
		
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.phone();
		s.fatherName();
		//Father.father();
		
		AccessModifierDemo demo = new AccessModifierDemo();
		demo.methodPublic();
		demo.methodProd();
		//Demo.method();
	}

	@Override
	public void homework() {
		System.out.println("son's homowork ");
		
	}

}
