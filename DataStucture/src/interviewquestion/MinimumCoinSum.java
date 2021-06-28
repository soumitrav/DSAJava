package interviewquestion;

import java.util.Arrays;

public class MinimumCoinSum {

	public static int coinChange(int[] coins, int amount) {
		
		int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for (int i=1;i<dp.length;i++) {
            for (int j=0;j<coins.length;j++) { 
                if (i - coins[j] >=0) 
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
            }
        }
        return dp[amount]==amount+1 ? -1 : dp[amount];
        
        
	}

	
	public static void main(String []args) {
		int []arr = new int[] {186,419,83,408};
		System.out.println(coinChange(arr,6249));
	}
}
