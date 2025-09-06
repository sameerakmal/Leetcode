import java.util.*;

class Solution {
    HashMap<Integer, List<String>> dp;

    public List<String> wordBreak(String s, List<String> wordDict) {
        dp = new HashMap<>();
        HashSet<String> hs = new HashSet<>(wordDict);
        return helper(0, s, hs);
    }

    List<String> helper(int i, String s, HashSet<String> hs) {
        if (dp.containsKey(i)) return dp.get(i);

        List<String> res = new ArrayList<>();
        if (i == s.length()) {
            res.add("");
            return res;
        }

        String temp = "";
        for (int j = i; j < s.length(); j++) {
            temp += s.charAt(j);
            if (hs.contains(temp)) {
                List<String> subSentences = helper(j + 1, s, hs);
                for (String sub : subSentences) {
                    if (sub.isEmpty()) res.add(temp);
                    else res.add(temp + " " + sub);
                }
            }
        }

        dp.put(i, res);
        return res;
    }
}
