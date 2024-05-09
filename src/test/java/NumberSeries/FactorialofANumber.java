package NumberSeries;

public class FactorialofANumber {
	public static void main(String[] args) {
		int n =5;
		int mul = 1;
		for(int i=1;i<=n;i++)
		{
			mul =mul*i;
		}
		
		System.out.println("Factorial of 5 ="+mul);
	}
}