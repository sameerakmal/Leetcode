class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] q : queries){
            int idx = q[0];
            while(idx <= q[1]){
                nums[idx] = (int)((1L * nums[idx] * q[3]) % (1000000007));
                idx += q[2];
            }
        }
        int res = 0;
        for(int i : nums){
            res ^= i;
        }
        return res;
    }
}