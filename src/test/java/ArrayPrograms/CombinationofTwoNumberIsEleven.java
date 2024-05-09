package ArrayPrograms;

public class CombinationofTwoNumberIsEleven {
	public static void main(String[] args) {
		int[] a = {8,4,7,3,9,2,5,6};
		for(int i=0;i<a.length;i++)
		{
			for(int j =i+1;j<a.length;j++)
			{
			if(a[i]+a[j]==11)
			{
				System.out.println(a[i]+" +"+ a[j]+" =11");
			}
				
			}
		}
		
		
		
	}

}
