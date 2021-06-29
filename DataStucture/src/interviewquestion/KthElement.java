package interviewquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class KthElement {

	static int getKthElement(List<Integer> list, int k) {
		java.util.Set<Integer> set = new TreeSet<Integer>(list);
		
		if(set.size() < k)
			return -1;
		
		int count=1;
		for (Integer val : set) {
			if(count == k)
				return val;
			count++;
		}
		return -1;
	}
	public static void main(String []args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		System.out.println(getKthElement(list, 1));
	}
}
