package NumberSeries;

public class PrintPrimeNoInArray {
	public static void main(String[] args) {
	int[] a = {1,2,3,4,5,6,7,8,9};
	for(int i =0;i<a.length;i++)
	{
		int count=0;
		for(int j =2;j<i/2;j++)
		{
			if(a[i]%a[j]==0)
			{
				count++;
			}
		}
			if(count<1)
			{
				System.out.println(a[i]);
			}
		}
	}
		
		
	}


