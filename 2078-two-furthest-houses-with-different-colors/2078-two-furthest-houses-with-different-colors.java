class Solution {
    public int maxDistance(int[] arr) {
        int n = arr.length;
        int maxDis = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int dis = 0;
            for(int j = 1; j < n; j++){
                if(arr[i] != arr[j]){
                    dis = Math.abs(i - j);
                    maxDis = Math.max(dis, maxDis);
                }
            }
        }
        return maxDis;
    }
}