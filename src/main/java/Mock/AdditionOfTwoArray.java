package Mock;

public class AdditionOfTwoArray {
	public static void main(String[] args) {
		int[] a = {4,3,1,2,5};
		int[] b = {3,4,6,7};
		int[] c = new int [5];//  c= 
		for(int i=0;i<c.length-1;i++)
		{
			c[i]=b[i];
			System.out.println(c[i]);
		}
		int add;
		for(int i=0;i<a.length;i++)
		{
			add = a[i]+c[i];
			System.out.println(a[i]+"+"+c[i]+"="+add);
		}
		
	}

}
