public class Solution {
  public int numSquares(int n) {

    int[] dp = new int[n+1];
    dp[0] = 0;
    for (int i = 1; i <= n; ++i){
      int min = i;
      for (int j = 1; (j * j) <= i; ++j ){

        int curr = dp[i - j*j] + 1;
        if (curr < min){
          min = curr;
        }

      }
      dp[i] = min;
    }

    return dp[n];

  }
}