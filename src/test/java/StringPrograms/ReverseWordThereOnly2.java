package StringPrograms;

public class ReverseWordThereOnly2 {
	public static void main(String[] args) {
		String st ="Hi Hello Welcome To";
		String[] s = st.split(" "); //
		
		for(int i=0;i<s.length;i++)
		{
		String str =s[i];
		for(int j = str.length()-1;j>=0;j--)// this line will reverse the words.
		{
      System.out.print(str.charAt(j));
		}
		
        System.out.print(" ");
		}
		
	}

}
