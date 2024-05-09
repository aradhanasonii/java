package StringPrograms;

import org.testng.annotations.Test;

public class StringDifferentPrints {
	@Test
	public  void pattern1() {
		String s = "Hello";
		for(int i=0;i<s.length();i++)
		{
			 System.out.print( s.charAt(i));
			 for (int j=0;j<=i;j++)
			 {
				 System.out.print(" ");
			 }
			}
		
		}
		
@Test
public void pattern2()
{
	String s = "h2$e3#el4$l/0";
	String s1 = s.replaceAll("[^A-Za-z0-9]","");
	int c =s1.length()-1;
	for(int i =0;i<s.length();i++)
	{
		if(s.charAt(i)>='a'&& s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9')
		{
		System.out.print(s1.charAt(c--));
		}
	
		else {
		System.out.print(s.charAt(i));
	
		}
	}
}

@Test
public void pattern3()
{
	String s = "ab12cd34ef1234";
	String[] s1 = s.split("[^0-9]");
	for(int i=s1.length-1;i>=0;i--)
	{
		System.out.print(s1[i]+" ");
	}
	
}
}

			
		
		
	


