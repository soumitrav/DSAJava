package Sorting;

public class BubbleSort {

	public static int[] bubbleSort(int []arr, int len) {
		
		for(int k = 0;k<len-1;k++) {
			int isNotSorted = 0;
			for(int i=0;i<len-k-1;i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					isNotSorted = 1;
				}
			}
			
			if(isNotSorted == 0)
				break;
		}
		return arr;
	}
	
public static void main(String []args) {
		
		//Best case O(n)
		// Worst case O(n^2)
		int []arr = new int[] {1,2,3,4,5,1};
		
		// Inplace sorting
		for(int res : bubbleSort(arr, arr.length)) {
			System.out.print(res+" ");
		}
		
	}
}
