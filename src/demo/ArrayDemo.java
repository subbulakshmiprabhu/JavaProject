package demo;

import java.util.Arrays;

public class ArrayDemo {
	
	
	
	public void arraySample() {
		
		int arr[] = {1, 10 , 3, 4 , 5}; // int temp =10
		int count =1;
		//arr[count] = arr[count = count+1];
		System.out.println("result "+arr[count = count+1]);
		
		
		System.out.println(arr[3]);
		System.out.println(arr.length);
		
		for(int i = 0; i<=arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
		//for each loop or enhanced loop
		System.out.println("for each loop");
		
		for(int i:arr) {
			System.out.println(i);
			
		}
		
		System.out.println("reverse array");
		for(int i = arr.length-1 ; i>=2; i--) {
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int arr2[] = new int[10];
		arr2[0]= 1;
		for(int i = 0; i<arr2.length ; i++) {
			
			arr2[i] = i+1;
			
		}
		
		System.out.println(Arrays.toString(arr2));
		
	}
	
	public void twodArray() {
		
		
		int[][] arr = {{1,2,3},
					   {4,5},
				      {7,8,9,10}};
		
		System.out.println(arr.length);
		System.out.println(arr[2].length);
		
		System.out.println("array");
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("using for each loop");
		for(int[]  a :arr) {
			for(int i :a) {
				System.out.print(i+" ");
			}System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		ArrayDemo demo = new ArrayDemo();
		demo.arraySample();
		demo.twodArray();
	}

}
