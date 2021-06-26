package Sorting;

public class MergeSort {

	public static int[] mergeSort(int []arr) {
		
		if(arr.length <2)
			return arr;
		
		int len = arr.length;
		int mid = len/2;
		
		int []Ln = new int[mid];
		int []Lr = new int[len-mid];
		
		for(int i=0;i<mid;i++) {
			Ln[i] = arr[i];
		}
		
		for(int j=0, k=mid;k<len;j++,k++) {
			Lr[j] = arr[k];
		}
		
		mergeSort(Ln);
		mergeSort(Lr);
		merge(Ln, Lr, arr);
		
		return arr;
	}
	private static int[] merge(int[] ln, int[] lr, int[] arr) {
		
		int i=0, j=0, k=0;
		
		while(i < ln.length && j< lr.length) {
			if(ln[i] < lr[j]) {
				arr[k] = ln[i];
				i++;
			} else {
				arr[k] = lr[j];
				j++;
			}
			k++;
		}
		
		while(i < ln.length) {
			arr[k] = ln[i];
			k++;
			i++;
		}
		while(j < lr.length) {
			arr[k] = lr[j];
			k++;
			j++;
		}
		
		return arr;
	}
	
	public static void main(String []args) {
		
		//Best case O(n)
		// Worst case O(n^2)
		int []arr = new int[] {1,2,3,4,5,1,2,3,0,1};
		
		// Inplace sorting
		for(int res : mergeSort(arr)) {
			System.out.print(res+" ");
		}
		
	}
}
