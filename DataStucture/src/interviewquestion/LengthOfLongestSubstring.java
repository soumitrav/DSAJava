package interviewquestion;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {

	public static int lengthOfLongestSubstring(String str) {
		
		if(str.length() == 1)
			return 1;
		int ans = 0;
		for(int i=0;i<str.length();i++) {
			List<Character> list = new ArrayList<>();
			boolean isDupFound = false;
			for(int j=i;j<str.length();j++) {
				if(list.contains(str.charAt(j))) {
					ans = Math.max(ans, list.size());
					isDupFound = true;
					break;
				}else {
					list.add(str.charAt(j));
				}
			}
			if(!isDupFound) {
				ans = Math.max(ans, list.size());
			}
		}
		return ans;
	}
	public static void main(String []args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
}
