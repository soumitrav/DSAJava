package binarySearch;

public class BinarySearchUsingLoop {

	public static int binarySearch(int []arr, int low, int high,int x) {
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] > x) {
				high = mid-1;
			} else {
				low = mid+1;
			}
			
		}
		return -1;
	}
	public static void main(String []args) {
	
		int []arr = new int[] {2,4,6,7,9,10};
		System.out.println(binarySearch(arr, 0, arr.length-1,2));
	}
}
