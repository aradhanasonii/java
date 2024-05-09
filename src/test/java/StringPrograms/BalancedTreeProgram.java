package StringPrograms;

import java.util.ArrayList;

public class BalancedTreeProgram {
	public static void main(String[] args) {
		String s="{[()]}";
		
		ArrayList<Character> a = new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			if(a.size()!=0 && ((s.charAt(i)=='}' && a.get(a.size()-1)=='{')
				|| (s.charAt(i)==')' && a.get(a.size()-1)=='(')
		      	|| (s.charAt(i)==']' && a.get(a.size()-1)=='[')))
		      	{
			a.remove(a.size()-1);
		      	}
			else 
			{
				a.add(s.charAt(i));
			}
		}
		if(a.size()==0)	
		{
		System.out.println("The string is balanced");
		}
		else
		{
			System.out.println("The string is not balanced");
		}
			
		}
		
	}


