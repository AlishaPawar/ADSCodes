class BSort
{
	static void bsort(int arr[])
	{	
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) 
		{
			for(int j = 0; j < n - i- 1; j++){  //compare unsorted adjacent elements
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}	
		}
	}

	static void display(int arr[])
	{
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = {23, 56, 34, 89, 34, 21, 78};
		int n = arr.length;

		System.out.println("Before Sorting");
		display(arr);

		bsort(arr);
		System.out.println("After Sorting");
		display(arr);
	}
}