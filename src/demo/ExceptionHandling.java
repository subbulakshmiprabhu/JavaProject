package demo;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	
	public static void checkedDemo() throws InterruptedException {
		Thread.sleep(5000);   //checked exception
		
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		checkedDemo();
		
		Scanner scan = null ;
		try {
	System.out.println("Enter  two numbers");
	 scan = new Scanner(System.in);
	
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	int div = num1/num2;
	
	System.out.println(div);
		}catch(ArithmeticException e) {
			//System.err.println("exception occured");
			//System.err.println(e.getMessage());
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			scan.close();
			System.out.println("finally block");
		}
		System.out.println("end");
	
	}

}
