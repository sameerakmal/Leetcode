class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDist = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(target == nums[i]){
               int dist = Math.abs(start - i);
                minDist = Math.min(dist, minDist);
            }
        }
        return minDist;
    }
}