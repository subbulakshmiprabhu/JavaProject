package demo;

public class PatternDemo {
	
	
	public void printPattern() {
		
		
		for(int i = 1; i<=5 ;i++) {
			for(int j = 1; j<=5; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	
	public void printPattern2() {
		
		for(int i = 1; i<=5 ;i++) {
			for(int j = 1; j<=5; j++) {
				
				if(i==1|| i==5 || j==1 || j==5) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
	}
	
	public  void printPattern3()
    {
        int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= 5; i++) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing column values upto the row
                // value.
                System.out.print(j + " ");
            }

            // print new line for each row
            System.out.println();
        }
    }

	
	
	public static void main(String[] args) {
		PatternDemo demo = new PatternDemo();
		demo.printPattern3();
	}

}
