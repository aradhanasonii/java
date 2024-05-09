package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccuranceOfWordsWithOrWithoutMap {
	@Test
	public void CountTheOccurance() {
		String s = "Hi Hello Hello Welcome To To";
		String[] st=s.split(" ");
		for(int i =0;i<st.length;i++)
		{
			int count =0;
			for(int j =0;j<st.length;j++)
			{
				if (st[i].equalsIgnoreCase(st[j])) //text is there thatswhy we will use equalignorecase
				{
					if(i>j) {
						break;
					}
					else {
						count++;
					}
				}
			}
			if(count>=1)
			{
				System.out.println(st[i]+ " "+count);
			}
		}
		
	}
@Test	
public void RemoveDuplicates()
{
	String s = "Hi Hello Hello Welcome To To";
	String[] st=s.split("");
	for(int i =0;i<st.length;i++)
	{
		int count =0;
		for(int j =0;j<st.length;j++)
		{
			if (st[i].equalsIgnoreCase(st[j])) //text is there thatswhy we will use equalignorecase
			{
				if(i>j) {
					break;
				}
				else {
					count++;
				}
			}
		}
		if(count==1)
		{
			System.out.println(st[i]);
		}
	}
	
}
@Test
public void DuplicateWords()
{
	String s = "Hi Hello Hello Welcome To To";
	String[] st=s.split("");
	for(int i =0;i<st.length;i++)
	{
		int count =0;
		for(int j =0;j<st.length;j++)
		{
			if (st[i].equalsIgnoreCase(st[j])) //text is there thatswhy we will use equalignorecase
			{
				if(i>j) {
					break;
				}
				else {
					count++;
				}
			}
		}
		if(count>1)
		{
			System.out.println(st[i]);
		}
	}
	
}
@Test
public void uniqueWords()
{
	String s = "Hi Hello Hello Welcome To To";
	String[] st=s.split("");
	for(int i =0;i<st.length;i++)
	{
		int count =0;
		for(int j =0;j<st.length;j++)
		{
			if (st[i].equalsIgnoreCase(st[j])) //text is there thatswhy we will use equalignorecase
			{
				if(i>j) {
					break;
				}
				else {
					count++;
				}
			}
		}
		if(count==1)
		{
			System.out.println(st[i]);
		}
	}
	
}
@Test
public void CounttheOccuranceusingMap()
{
	String s = "Hi Hello Hello Welcome To To";
	String[] st = s.split(" ");
	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	for(int i=0;i<st.length;i++)
	{
		if(map.containsKey(st[i]))
		{
			map.put(st[i], map.get(st[i])+1);
		}
		else 
		{
			map.put(st[i], 1);
		}
	}
	System.out.println(map);
}
@Test
public void removeduplicateusingmap()
{
	String s = "Hi Hello Hello Welcome To To";
	String[] st = s.split(" ");
	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	for(int i=0;i<st.length;i++)
	{
		if(map.containsKey(st[i]))
		{
			map.put(st[i], map.get(st[i])+1);
		}
		else 
		{
			map.put(st[i], 1);
		}
	}
	for(Entry<String,Integer>m:map.entrySet())
	{
		//if(m.getValue()>=1)
	//	{
			System.out.println(m.getKey());
	//	}
	}
}
@Test
public void DuplicateWordsUsingMap()
{
	String s = "Hi Hello Hello Welcome To To";
	String[] st = s.split(" ");
	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	for(int i=0;i<st.length;i++)
	{
		if(map.containsKey(st[i]))
		{
			map.put(st[i], map.get(st[i])+1);
		}
		else 
		{
			map.put(st[i], 1);
		}
	}
	for(Entry<String,Integer>m:map.entrySet())
	{
		if(m.getValue()>1)
		{
			System.out.println(m.getKey());
		}
	}
}
@Test
public void uniquewordsusingMap()
{
	String s = "Hi Hello Hello Welcome To To";
	String[] st = s.split(" ");
	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	for(int i=0;i<st.length;i++)
	{
		if(map.containsKey(st[i]))
		{
			map.put(st[i], map.get(st[i])+1);
		}
		else 
		{
			map.put(st[i], 1);
		}
	}
	for(Entry<String,Integer>m:map.entrySet())
	{
		if(m.getValue()==1)
		{
			System.out.println(m.getKey());
		}
	}	
}
}





