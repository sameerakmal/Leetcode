class Solution {
    int[][][][] dp;
    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        dp = new int[n][n][n][n]; 
        return isScramble(s1, 0, n - 1, s2, 0, n - 1);
    }

    private boolean isScramble(String s1, int l1, int h1, String s2, int l2, int h2) {
        if (dp[l1][h1][l2][h2] != 0) {
            return dp[l1][h1][l2][h2] == 1;
        }
        if (s1.substring(l1, h1 + 1).equals(s2.substring(l2, h2 + 1))) {
            dp[l1][h1][l2][h2] = 1;
            return true;
        }
        for (int k = l1; k < h1; k++) {
            int len = k - l1 + 1;
            boolean case1 = isScramble(s1, l1, k, s2, l2, l2 + len - 1) &&
                            isScramble(s1, k + 1, h1, s2, l2 + len, h2);

            boolean case2 = isScramble(s1, l1, k, s2, h2 - len + 1, h2) &&
                            isScramble(s1, k + 1, h1, s2, l2, h2 - len);

            if (case1 || case2){
                dp[l1][h1][l2][h2] = 1;
                return true;
            } 
        }
        dp[l1][h1][l2][h2] = -1;
        return false;
    }
}
