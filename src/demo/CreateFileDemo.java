package demo;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("G:\\Subbulakshmi\\Demo\\test.txt");
		
		
		boolean createNewFile = f.createNewFile();
		
		if(createNewFile) {
			System.out.println("file created");
		}else
		{
			System.out.println("file not created");
		}
		
		
	}

}
