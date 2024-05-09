package NumberSeries;

import org.testng.annotations.Test;

public class PrimeNumber {
	@Test
	public  void primenumber() {
		int n =30;
		for(int i=0;i<=n;i++)
		{
			int count =0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
		
		
	}
	
	@Test
	public void Check7isPrimeNoorNot()
	{
		int n =7;
		int m =n/2;
		int count =0;
		for(int i =2;i<m;i++)
		{
			if(n%i==0)
			{
				count++;
				
			}
		}
			if(count>=1)
			{
				System.out.println("Not prime");
		}
			else {
				System.out.println("Is prime");
			}
	}

}
