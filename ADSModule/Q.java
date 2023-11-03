public class Q {
    public static void swap(int arr[], int x, int y) 
	{
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void qsort(int arr[], int left, int right) 
	{
        // if partition has single element or invalid partition return.
        if (left >= right)
            return;

        // consider left element as pivot--arr[left]
        int i = 0, j = right;
        
		 while (i < j) 
		{
            //from left side (i) find element greater than pivot
            while (arr[i] <= arr[left])
                i++;

            //from right (j) find element less than or equal to pivot
            while (arr[j] > arr[left]) {
                j--;
            }

            //if i less than j,swap i element with j element
            if (i < j)
                swap(arr, i, j);
        }
        // swap j element with pivot element
        swap(arr, j, left);

        // apply quick sort to left partition -left to j-1
        qsort(arr, left, j - 1);
        // apply quick sort to right partition -j+1 to right
        qsort(arr, j + 1, right);

    }

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = { 23, 28, 36, 42, 57, 75, 80, 30, 11, 45 };
        int n = arr.length;
        System.out.println("Before Sorting:");
        display(arr);
        qsort(arr, 0, n - 1);
        System.out.println("After Sorting:");
        display(arr);
    }

}