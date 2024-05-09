package StringPrograms;

public class CountNoOfCharacter {
	public static void main(String[] args) {
	
		String s ="Bang o lore";
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ') // it will not capture the space.
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
