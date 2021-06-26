package Sorting;

public class QuickSort {

	public static int[] quickSort(int []arr, int start, int end) {
		if(start>=end)
			return arr;
		int pIndex = partition(arr, start, end);
		quickSort(arr, start, pIndex-1);
		quickSort(arr, pIndex+1, end);
		
		return arr;
	}
	
	static int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high]; 
		int i = (low-1); // index of smaller element 
		for (int j=low; j<high; j++) 
		{ 
			// If current element is smaller than or 
			// equal to pivot 
			if (arr[j] <= pivot) 
			{ 
				i++; 

				// swap arr[i] and arr[j] 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		// swap arr[i+1] and arr[high] (or pivot) 
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 
	
	public static void main(String []args) {
		
		//Best case O(n)
		// Worst case O(n^2)
		int []arr = new int[] {2,1,3,4,5,2,3};
		
		// Inplace sorting
		for(int res : quickSort(arr, 0, arr.length-1)) {
			System.out.print(res+" ");
		}
		
	}
}
