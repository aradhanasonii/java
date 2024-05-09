package StringPrograms;

import java.util.HashMap;

public class OccuranceOfCharacterUsingHashMap {
	public static void main(String[] args) {
		String st = "Tester";
		String s = st.toLowerCase();
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>(); //this hashmap is empty nothing is there.
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else {
				map.put(s.charAt(i), 1);
				
			}
		}
		
		System.out.println(map);
	}

}
