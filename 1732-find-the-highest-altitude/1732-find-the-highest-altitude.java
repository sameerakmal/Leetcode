class Solution {
    public int largestAltitude(int[] gain) {
        int prefSum = 0;
        int maxSum = 0;
        for(int g : gain){
            prefSum += g;
            maxSum = Math.max(maxSum, prefSum);
        }
        return maxSum;
    }
}