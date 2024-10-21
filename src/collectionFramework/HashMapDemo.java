package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("English", 90);
		map.put("Tamil", 95);
		map.put("Maths", 98);
		map.put("English", 95);
		map.put("zZ", null);
		map.put("science", null);
	//	map.put
		System.out.println(map);
		
		
		//iterating the keys
		
		Set<String> keySet = map.keySet();
		
		for(String s :keySet) {
			System.out.println(s);
		}
		
		//iterating the values
		Collection<Integer> values = map.values();
		for(Integer i :values) {
			System.out.println(i);
		}
		
		//iterating the entries
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		
		for(Entry<String, Integer> entry:entrySet) {
			//System.out.println(entry);
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " "+ value);
		}
		
		//To get the value based on the key
		Integer tamilMark = map.get("Tamil");
		System.out.println(tamilMark);
		
		
	}

}
