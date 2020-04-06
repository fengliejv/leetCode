package di;

/**
 * Created by fengliejv on 2020/4/6.
 */
public class KeysKeyboard650 {
    public int minSteps(int n) {
        int[] dp = new int[n+1];

        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = i-1; j > 1; j--) {
                if (i % j == 0) {
                    dp[i] = dp[j] + (i/j);
                    break;
                }

            }
        }
        return dp[n];
    }
}
