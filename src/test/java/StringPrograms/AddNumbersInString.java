package StringPrograms;

public class AddNumbersInString {
	public static void main(String[] args) {
		String s = "a1b2c3d";
		int sum =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				int n =s.charAt(i)-48; //ascii value of 0 to 9 is 48 to 57.
				sum =sum +n;
			}
		}
    System.out.println(sum);
}
}
