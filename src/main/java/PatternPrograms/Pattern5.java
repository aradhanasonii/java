package PatternPrograms;

public class Pattern5 {
	public static void main(String[] args) {
		int n =5;
		for(int i=1;i<=n;i++) //i means row
		{
			for(int j=i;j<n;j++) //j means column
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
