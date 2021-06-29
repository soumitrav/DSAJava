package interviewquestion;

public class FibonacciSearies {

	public static int fib(int n) {
		if(n <=0)
			return 0;
		if(n == 1)
			return 1;
		int res = fib(n-1)+fib(n-2);
		return res;
	}
	
	public static void fibPrint(int n) {
		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int i = 0;
		while(i<n-1) {
			int c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
			i++;
		}
	}
	
	
	public static void main(String []args) {
		fibPrint(9);
	}
}
