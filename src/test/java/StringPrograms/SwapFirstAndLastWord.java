package StringPrograms;

public class SwapFirstAndLastWord {
	public static void main(String[] args) {
		String st = "Hi Hello Welcome To";
		String [] s = st.split(" ");
		String temp = s[0];
		s[0] = s[s.length-1];
		s[s.length-1]=temp;
		for(int i =0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	}

}
