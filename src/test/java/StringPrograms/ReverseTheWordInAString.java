package StringPrograms;

import org.testng.annotations.Test;

public class ReverseTheWordInAString {
	@Test
	public void Reverse()
	{
		String s = "Hi Hello Welcome to";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
 @Test
 public void Reverse1()
 {
	 String s = "Hi Hello Welcome to";
	 String[] st = s.split(" ");
	 for(int i =st.length-1;i>=0;i--)
			  {
		 System.out.print(st[i]);
		 
	 }
 }
	
	
}
