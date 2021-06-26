package Sorting;

public class SelectionSort {

	public static int[] selectionSort(int []arr, int len) {
		
		for(int i=0;i<len-1;i++) {
			int iMin = i; // minimum index for every pass
			
			for(int j = i+1;j<len;j++) {
				if(arr[j] < arr[iMin]) {
					iMin = j; // replace iMin with j for every smaller element
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[iMin];
			arr[iMin] = temp;
			
		}
		
		return arr;
	}
	public static void main(String []args) {
		
		int []arr = new int[] {1,3,4,2,10,3,5};
		// Big O
		// First pass (n) second pass (n-1)*(n-2)*(n-3)..1
		// Big O will be O(n^2)
		// Space Complexity Big O(1)
		// Inplace sorting
		for(int res : selectionSort(arr, arr.length)) {
			System.out.print(res+" ");
		}
		
	}
}
