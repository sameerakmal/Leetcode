class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;

        int[] prefMax = new int[n];
        int[] suffMin = new int[n];

        prefMax[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefMax[i] = Math.max(prefMax[i-1], nums[i]);
        }

        suffMin[n-1] = nums[n-1];
        for(int i = n - 2; i >= 0; i--){
            suffMin[i] = Math.min(suffMin[i + 1], nums[i]);
        }

        int[] res = new int[n];
        res[n - 1] = prefMax[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            if (prefMax[i] > suffMin[i + 1]) {
                res[i] = res[i + 1];
            }

            else {
                res[i] = prefMax[i];
            }
        }

        return res;

    }
}