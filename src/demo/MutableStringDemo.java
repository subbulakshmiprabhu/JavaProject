package demo;

public class MutableStringDemo {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb.append(" program"));
		System.out.println(sb.reverse());
		String string = sb.toString();	
		
		
		StringBuffer sbf = new StringBuffer("java");
		System.out.println(sbf.append(" class"));
	}

}
