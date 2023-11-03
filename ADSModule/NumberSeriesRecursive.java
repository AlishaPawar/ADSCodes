class NumberSeriesRecursive
{
	public static void printNumberSeries(int n)
	{
		if(n <= 0)
		{
			return ;
		}
		printNumberSeries(n-1);

		System.out.println(n);
	}
	public static void main(String args[])
	{
		int n = 10;
		System.out.println("Number series : ");
		printNumberSeries(n);
	}
}