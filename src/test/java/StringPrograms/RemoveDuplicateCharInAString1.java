package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharInAString1 {
	public static void main(String[] args) {
		String st ="Tester";
		String s =st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i =0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) {
			
			System.out.println(ch);
		}
	}

}
