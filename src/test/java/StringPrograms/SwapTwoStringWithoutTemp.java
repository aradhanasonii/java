package StringPrograms;

public class SwapTwoStringWithoutTemp {
	public static void main(String[] args) {
		String s ="java";
		String s1 ="Coding";
		s = s+s1;
		s1=s.substring(0,(s.length()-s1.length()));
		s=s.substring(s1.length());
		System.out.println(s);
		System.out.println(s1);
		
		
		
	}

}
