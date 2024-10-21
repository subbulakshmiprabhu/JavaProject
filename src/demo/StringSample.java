package demo;

public class StringSample {
	public static void main(String[] args) {
		String s1 = "java";
		String s2  = "welcome to java";
		String s3 = "value";
		
		String s4 = new String("java");
		String s5 =new String("java");
		
		String replace = s1.replace('j', 'a');
		System.out.println(s1);
		
		if(s1 == s2) {
			System.out.println("s1 is equal to s2");
		}
		
		
		
		if(s1 == s4) {
			System.out.println("s1 is equal to s4 using ==");
		}
		
		if(s1.equals(s4)) {
			System.out.println("s1 is equal to s4");
		}
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		System.out.println(s3.trim());
		
		System.out.println(s1.indexOf('v'));
		
		System.out.println(s1.charAt(2));
		
		System.out.println(s1.startsWith("ja"));
		System.out.println(s1.endsWith("va"));
		
		String str = s1.concat(" program");
		
		System.out.println(str);
		
		System.out.println(s1.contains("ava"));
		
		
		char[] charArray = s1.toCharArray();
		
		for(char c: charArray) {
			System.out.println(c);
		}
		
		
		String[] split = s2.split(" ");
		
		for(String s : split) {
			System.out.println(s);
		}
		
		String substring = s3.substring(2);
		System.out.println(substring);
		System.out.println(s3.subSequence(2, 4));
		
		
		StringSample demo = new StringSample();
		demo.reverseString();
		
		
	}
	
	public void reverseString() {
		String s = "java";
		String revString = "";
		
		for(int i = s.length()-1 ; i>=0 ; i--) {
			revString += s.charAt(i);
		}
		System.out.println("reversed string :"+ revString);
	}

}
