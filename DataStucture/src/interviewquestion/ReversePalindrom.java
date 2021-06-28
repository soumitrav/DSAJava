package interviewquestion;

public class ReversePalindrom {

	public static int isReversePalindrom(int num){
		
		int add = num;
		int count = 0;
		while(add <= Integer.MAX_VALUE)
		{
			String strNum = new StringBuffer(Integer.toString(num)).reverse().toString();
			add = add+Integer.valueOf(strNum);
			
			if(add == Integer.valueOf(new StringBuffer(Integer.toString(add)).reverse().toString()))
			{
				count++;
				System.out.println(count+" "+add);
				return add;
			}
			count++;
			System.out.println(count+" "+add);
		}
		
		return add;
		
	}
	public static void main(String []args) {
		System.out.println(isReversePalindrom(93));
	}
}
