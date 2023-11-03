class MSort
{
	static void mergeSort(int arr[], int left, int right)
	{
		if(left < right)
		{
			int mid = left +(right - left)/2;
			mergeSort(arr, left, mid);		//left subproblem		23, 		56, 		34, 		89, 		34, 		21, 		78
			mergeSort(arr, mid+1, right);		//right subproblem	left		                 mid                      right
			merge(arr, left, mid, right);
		}
	}

	static void merge(int arr[], int left, int mid, int right)
	{
		
		int n1 = (mid - left) + 1;		//left element size(4)  23 56 34 89<-mid
		int n2 = (right - mid);			//right element size(3) 34 21 78

		int L[] = new int[n1];
		int R[] = new int[n2];

		// shift array elements to left array
		for(int i =0; i < n1; i++){
			L[i] = arr[1 + i];
		}

		// shift array elements to right array
		for(int j =0; j < n2; j++)
		{
			R[j] = arr[mid + 1 + j];
		}
	
		int i = 0;
		int j = 0;
		int k = left;

		while(i < n1 && j < n2)
		{
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while(i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		while(j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
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

		mergeSort(arr, 0, n - 1);
		System.out.println("After Sorting");
		display(arr);
	}
}