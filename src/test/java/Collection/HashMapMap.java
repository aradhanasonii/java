package Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapMap {
	public static void main(String[] args) {
		HashMap<Integer, Object> set = new HashMap<Integer,Object>();
		set.put(10, 'A');
		set.put(40, "hii");
		set.put(10, 80);
		set.put(null, 'B');
		set.put(30, null);
		set.put(null, 20);
		set.put(90, null);
		
		System.out.println(set);
		System.out.println(set.containsKey(10));
		System.out.println(set.containsValue("hii"));
		System.out.println(set.replace(10, "hello"));
	for (Entry<Integer, Object> m : set.entrySet()) {
	System.out.println(m.getKey()+" "+ m.getValue());
	}
	}
		
		
		
	}


