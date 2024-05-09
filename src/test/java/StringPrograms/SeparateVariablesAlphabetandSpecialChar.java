package StringPrograms;

public class SeparateVariablesAlphabetandSpecialChar {
	public static void main(String[] args) {
		String s = "a1b&3$c";
		String alp =" ";
		String num =" ";
		String spec = " ";
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			if(c>='A' && c<='Z'|| c>='a'&& c<='z')
			{
				alp=alp+c;
				
			}
			else if(c>='0' && c<='9')
			{
				num = num+c;
			}
			else {
				spec = spec+c;
			}
		}
		
		System.out.println(alp+num+spec);
	}

}
