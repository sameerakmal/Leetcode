class Solution {
    public int maxProduct(int[] arr) {
        int currMax = arr[0];
        int currMin = arr[0];
        int maxPr = arr[0];
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int prevMax = currMax;
            int num = arr[i];

            int max1 = num;
            int max2 = prevMax * num;
            int max3 = currMin * num;
            currMax = Math.max(max1, Math.max(max2, max3));

            int min1 = num;
            int min2 = prevMax * num;
            int min3 = currMin * num;
            currMin = Math.min(min1, Math.min(min2, min3));

            maxPr = Math.max(maxPr, currMax);
        }
        return maxPr;
    }
}