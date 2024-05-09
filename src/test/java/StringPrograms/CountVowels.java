package StringPrograms;

public class CountVowels {
	public static void main(String[] args) {
		String st ="India";
		String str = st.toLowerCase();
	char[]	s =st.toCharArray();
	int count=0;
	for(int i =0;i<s.length;i++)
	{
		if(s[i]=='a'|| s[i]=='e'|| s[i]=='o'|| s[i]=='u'|| s[i]=='i')
		{
			count++;
			System.out.print(s[i]);
		}
	}
	System.out.print(count);	
	}

}
