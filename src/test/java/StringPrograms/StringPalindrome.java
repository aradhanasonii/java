package StringPrograms;

public class StringPalindrome {
	public static void main(String[] args) {
		String S = "Malayalam";
		String rev ="";
		for(int i=S.length()-1;i>=0;i--)
		{
			rev = rev+ S.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(S)) {
			System.out.println("Is a palindrome");
		
	}
	else {
		System.out.println("Not a palindrome");
	}

}
}
