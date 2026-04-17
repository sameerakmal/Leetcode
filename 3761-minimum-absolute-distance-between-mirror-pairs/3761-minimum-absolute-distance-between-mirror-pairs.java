class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(hm.containsKey(num)){
                ans = Math.min(ans, Math.abs(i - hm.get(num)));
            }
            int rev = 0;
            while(num > 0){
                int dig = num % 10;
                rev = rev * 10 + dig;
                num /= 10;
            }
            hm.put(rev, i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}