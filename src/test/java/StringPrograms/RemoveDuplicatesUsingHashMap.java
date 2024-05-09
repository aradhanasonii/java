package StringPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RemoveDuplicatesUsingHashMap {
	public static void main(String[] args) {
		String st = "Tester";
		String s = st.toLowerCase();
		
		LinkedHashMap<Character, Integer> set = new LinkedHashMap<Character,Integer>(); //this hashmap is empty nothing is there.
		for(int i=0;i<s.length();i++)
		{
			if(set.containsKey(s.charAt(i)))
			{
				set.put(s.charAt(i), set.get(s.charAt(i))+1);
			}
			else {
				set.put(s.charAt(i), 1);
				
			}
		}
		for(Entry<Character,Integer>m: set.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		
	}
		
		
	}


