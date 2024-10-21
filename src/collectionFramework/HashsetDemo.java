package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashsetDemo {
	
	
	public static void main(String[] args) {
		TreeSet<Object> tSet = new TreeSet<>();
		tSet.add("zzzz");
		tSet.add("aaaa");
		tSet.add("xxxxx");
		tSet.add("java");
		tSet.add("bbbb");
		tSet.add("AAAA");
		tSet.add("123");
		
		System.out.println(tSet);
		
		tSet.size();
		
		tSet.remove("java");
		
		//iterator
		
		Iterator<Object> itr = tSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//for each loop
		
		for(Object o :tSet) {
			System.out.println(o);
		}
 	}

}
