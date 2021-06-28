package interviewquestion;

import java.util.Scanner;

public class PrintStarAndMinus {

	public static String fillChar(String str) {
		char[] arr = str.toCharArray();
		StringBuilder res = new StringBuilder();
		
		for(int i=0;i<str.length()-1;i=i+1) {
			if((arr[i]%2==0) & (arr[i+1]%2 !=0) || (arr[i+1]%2==0) & (arr[i]%2 !=0)) {
				res.append(arr[i]);
				//res.append(arr[i+1]);
			}
			else if((arr[i]%2==0) & (arr[i+1]%2 == 0)) {
				res.append(arr[i]);
				res.append("*");
				//res.append(arr[i+1]);
			}else if((arr[i]%2==1) & (arr[i+1]%2 == 1)){
				res.append(arr[i]);
				res.append("-");
				//res.append(arr[i+1]);
			}
		}
		res.append(arr[arr.length-1]);
		return res.toString();
		
	}
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		//String str = "21462675756";
		//String str = "98766555533";
		System.out.println(fillChar(str));
	}
}
