package interviewquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChunkArrayProblme {

	public static void main(String []args) {
		int []arr = new int[] {1,2,3,4,5,6,7,8};
		int cap = 4;
		
		int len = arr.length/cap;
		int [][]res;
		if(cap == 1 || arr.length%cap == 0) {
			res = new int[len][];	
		} else {
			res = new int[len+1][];
		}
		
		int count=0;
		int i = 0;
		for(;count<arr.length-cap;count=count+cap,i++) {
			res[i] = Arrays.copyOfRange(arr, count,count+cap);
		}
		
		res[i] = Arrays.copyOfRange(arr, count, arr.length);
		
		for(int j=0;j<res.length;j++) {
			for(int k=0;k<res[j].length;k++) {
				System.out.print(res[j][k]+" ");
			}
			System.out.println();
		}
		
	}
}
