class SumSeriesRecursive{
	public static int sumSeries(int n){
		if(n == 1){
			return n;
		}else{
			return n + sumSeries(n - 1);
		}
	}
	public static void main(String args[]){
		int n = 10;
		int sum = sumSeries(n);
		System.out.println("Sum of series from 1 to "+n+" is :"+sum);
	}
}