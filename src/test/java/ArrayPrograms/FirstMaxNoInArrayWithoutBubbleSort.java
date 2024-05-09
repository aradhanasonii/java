package ArrayPrograms;

public class FirstMaxNoInArrayWithoutBubbleSort {
	public static void main(String[] args) {
		int[] a = {5,2,0,1,4};
		int fmax = a[0];
		for (int i= 0;i<a.length;i++)
		{
			if(fmax<a[i]) {
				fmax = a[i];
			}
		}
		
		System.out.println(fmax);
		
	}
	
	
	


}
