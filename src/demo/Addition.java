package demo;

public class Addition {
	
	public static void add() {
		int sum =0;
		for(int i = 0; i< 10; i++) {
			
			sum +=i;
			
		}
		System.out.println(sum);
		
	}
	
	
	public static void convert() {
		
		
		// String to Integer coversion
		
		String s = "10.2";
		//int num = Integer.parseInt(s);
		
		double num = Double.parseDouble(s);
		
		System.out.println(num);
		
		//int to String conversion
		int i = 10;
		
		String str = String.valueOf(i);
		
		System.out.println(str);
		
		
	}
	
	public static void main(String[] args) {
		//add();
		convert();
	}

}
