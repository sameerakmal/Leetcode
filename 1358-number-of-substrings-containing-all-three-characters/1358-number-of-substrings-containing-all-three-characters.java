class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] cnt = new int[3];
        int lt = 0;
        int ans = 0;

        for(int rt = 0; rt < n; rt++){
            cnt[s.charAt(rt) - 'a']++;

            while(cnt[0] > 0 && cnt[1] > 0 && cnt[2] > 0){
                ans += (n - rt);

                cnt[s.charAt(lt) - 'a']--;
                lt++;
            }
        }
        return ans;
    }
} 