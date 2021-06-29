package interviewquestion;

import java.util.TreeMap;

public class MaxCharMap {

	public static void main(String []args) {
		String str = "abcddfff";
		
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>((a,b) -> b-a);
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i)) == null) {
				map.put(str.charAt(i), 1);
				
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		
		System.out.println(map.pollFirstEntry());
		System.out.println(map.pollFirstEntry());
		
	}
}
