package StringPrograms;

public class Password {
	public static void main(String[] args) {
		String s ="Rdh34aaa50";
		Boolean flag = false;
		int capCount=0;
		int numCount=0;
		int concurrent=0;
		if(s.length()>=8 && s.length()<=16 && !(s.contains(" ")))
		{
			for(int i=0;i<s.length();i++)
			{
				//if(s.charAt(i))
			}
		}
		if(flag==true)
		{
			System.out.println("Valid password");
		}
		else
		{
			System.out.println("Invalid password");
		}
	}

}
