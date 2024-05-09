package StringPrograms;

public class PrintStringPatternMAXLength {
	public static void main(String[] args) {
		String[] s = {"ab","abc","abcd","cd","cdfg"};
		String max_length = s[0]; //s[0] means "ab". the length of ab is 2.
		for(int i =0;i<s.length;i++)
		{
			if(s[i].length()>max_length.length())
			{
				max_length=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==max_length.length())
			{
				System.out.println(s[i]);
			}
		}
	}

		
	}


