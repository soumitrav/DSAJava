package interviewquestion;

import java.util.Arrays;

public class Anagrams {

	public static boolean isAnagram(String str1, String str2) {
		System.out.println();
		str1  = str1.replaceAll("[^a-zA-Z0-9]", "");
		str2  = str2.replaceAll("[^a-zA-Z0-9]", "");
		char ch[] = str1.toCharArray();
		char ch1[] = str2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		return new String(ch).equalsIgnoreCase(new String(ch1));
	}
	public static void main(String []args) {
		System.out.println(isAnagram("FAIRY TALES", "rail safety"));
	}
}
