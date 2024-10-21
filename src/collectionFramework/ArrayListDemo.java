package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {
	
	
	public static void main(String[] args) {
		
		
		LinkedList<Object> a = new LinkedList<>();
		
		a.add("java");
		a.add(10);
		a.add(true);
		a.add(10.2);
		a.add("program");
		a.add("java");
		
		
		System.out.println(a.size());
		System.out.println(a);
		
		//To get the index of an object
		
		System.out.println(a.indexOf("java"));
		
		System.out.println(a.lastIndexOf("java"));
		
		//To get the value based on index
		
		System.out.println(a.get(3));
		
		//To replace a value
		
		a.set(4, 'c');
		
		System.out.println(a);
		
		//To remove an element
		
		a.remove(4);
		
		System.out.println(a);
		
		//cloning
		
		
		
		
		
		//for loop
		
		for(int i = 0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
			
		//for each loop
		
		for(Object o :a) {
			System.out.println(o);
			
		}
		
		
		//using itearator
		Iterator<Object> itr = a.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//using lambda expression
		System.out.println("using lambda expression");
		a.forEach(element -> System.out.println(element));
	
		
		
	}

}
