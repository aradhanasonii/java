package StringPrograms;

public class PrintStringPatternMINLength {
	public static void main(String[] args) {
		String[] s = {"ab","abc","abcd","cd","cdfg"};
		String min_length = s[0]; //s[0] means "ab". the length of ab is 2.
		for(int i =0;i<s.length;i++)
		{
			if(s[i].length()<min_length.length())
			{
				min_length=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==min_length.length())
			{
				System.out.println(s[i]);
			}
		}
	}

}
