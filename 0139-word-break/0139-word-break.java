class Solution {
    int[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        dp = new int[n];
        for(int i = 0; i < n; i++){
            dp[i] = -1;
        }
        HashSet<String> hs = new HashSet<>(wordDict);
        int isValid = helper(0, s, hs);
        return (isValid == 1); 
    }
    public int helper(int i, String s, HashSet<String> hs){
        if(i == s.length()){
            return 1;
        }
        if(dp[i] == -1){
            String temp = "";
            for(int j = i; j < s.length(); j++){
                temp += s.charAt(j);
                if(hs.contains(temp)){       
                    if (helper(j + 1, s, hs) == 1) {
                        dp[i] = 1;
                        return 1;
                    }
                }
            }
            dp[i] = 0;
        }
        return dp[i];
    }   
}