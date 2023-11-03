class BinarySearch{
	static int searchBinary(int arr[], int target){
		int left = 0;
		int right = arr.length - 1;

		while(left <= right){
			int mid = left + (right - left)/2;

			if(arr[mid] == target){
				return mid;
			}

			if(arr[mid] < target){
				left = mid + 1;
			}

			if(arr[mid] > target){
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String args[]){
		int arr[] = {2, 31, 45, 67, 74, 78, 89};
		int target = 31;
		int index = searchBinary(arr, target);
		
		if(index != -1){
			System.out.println("Element "+target+" found at index : "+index);
		}
		else{
			System.out.println("Element not found");
		}
	}
}