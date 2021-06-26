package Sorting;

public class InsertionSort {

	public static int[] insertionSort(int []arr, int len) {
		
		for(int i=1;i<len;i++) {
			
			int hole = i;
			int val = arr[i];
			
			while(hole>0 && arr[hole-1] > val) {
				arr[hole] = arr[hole-1];
				hole--;
			}
			arr[hole] = val;
		}
		return arr;
	}
	
public static void main(String []args) {
		
		//Best case O(n)
		// Worst case O(n^2)
		int []arr = new int[] {1,2,3,4,5,1,2,3,0};
		
		// Inplace sorting
		for(int res : insertionSort(arr, arr.length)) {
			System.out.print(res+" ");
		}
		
	}
}
