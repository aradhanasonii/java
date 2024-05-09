package NumberSeries;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = sc.nextInt();
		int fib1 =0;
		int fib2=1;
		int fib3;  
	for(int i=1;i<=n;i++) {
		fib3= fib1+fib2;
		fib1=fib2;
		fib2=fib3;
		System.out.print(" "+fib3);
	}
	
	}

}
