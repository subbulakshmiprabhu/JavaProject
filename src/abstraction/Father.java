package abstraction;

public interface Father {
	
	
	 int num = 10;
	
	 
	 public void phone() ;
	 
	 public void homework();
	 
	 public default void fatherName() {
	
		 System.out.println("Father name");
		Demo.method();
	 }
	 
	 
	 public static void father() {
		 System.out.println("father static method");
	 }
	 
	 class Demo{
		 public static void method() {
			 System.out.println("class inside interface");
		 }
	 }
	 

}
