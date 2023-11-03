class FibonacciRecursive
{
	public static long fibonacci(int n)
	{
		if(n <= 1)
		{
			return n;
		}else
		{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	static void printFibonacciSeries(int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.println(fibonacci(i)+" ");
		}
	}
	public static void main(String args[])
	{
		int n = 10;
		System.out.println("Fibonacci Series of "+n+" is :");
		printFibonacciSeries(n);
	}
}