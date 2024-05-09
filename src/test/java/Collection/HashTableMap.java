package Collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
public class HashTableMap {
	public static void main(String[] args) {
		Hashtable<Integer, Object> set = new Hashtable<Integer,Object>();
		set.put(10, 'A');
		set.put(40, "hii");
		set.put(10, 80);
		System.out.println(set);
		System.out.println(set.containsKey(10));
		System.out.println(set.containsValue("hii"));
		System.out.println(set.replace(10, "hello"));
	for (Entry<Integer, Object> m : set.entrySet()) {
	
		System.out.println(m.getKey()+""+m.getValue());
	}
			
			
		}
			
		
		
		
	}


