package StringPrograms;

import org.testng.annotations.Test;

public class StringDifferentOutput {
	@Test
	public void count()
	{
	String s = "aabbabc";
	for(int i=0;i<s.length();i++)
	{
		int count=0;
		for(int j=0;j<s.length();j++) {
			
		if(s.charAt(i)==s.charAt(j))
		{
			if(i>j)
			{
				break;
			}
			else {
				count++;
			}
		}
		
		}
		if(count>=1)
		{
			System.out.print(s.charAt(i)+""+count);
		}
	}
	}
@Test	
public void StringOutput()
{
String s = "aabbabc";
int count =1;
for(int i=0;i<s.length()-1;i++) {
	
	if(s.charAt(i)==s.charAt(i+1))
	{
		count++;
	}
	else {
		System.out.print(s.charAt(i)+""+count);
		count=1;
	}
	}
System.out.print(s.charAt(s.length()-1)+""+count);
}




@Test
public void StringOutput1()
{
	String s ="aabbabc";
	for(int i=0;i<s.length()-1;i++)
	{
		if(s.charAt(i)==s.charAt(i+1))
		{
			System.out.print(s.charAt(i));
		}
		else {
			System.out.println(s.charAt(i));
		}
	}
	System.out.println(s.charAt(s.length()-1));
}
}
