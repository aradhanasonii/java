package ArrayPrograms;

public class IndexSum {
	public static void main(String[] args) {
		int[] a = {1,2,4,5,0,2,3};
		int target = 6;
		for(int i=0;i<a.length;i++)
		{
			int sum =0;
			for(int j=i+1;j<a.length;j++)
			{
				sum = a[i]+a[j];
				if(sum==target)
				{
					System.out.println(i+" "+j);
				}
			}
		}
		
	}

}
