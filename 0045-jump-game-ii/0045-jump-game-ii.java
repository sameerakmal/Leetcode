class Solution {
    public int jump(int[] arr) {
        int n = arr.length;
        if(n <= 1){
            return 0;
        }
        int jumps = 0;
        int currEnd = 0;
        int farthest = 0;
        for(int i = 0; i < n; i++){
            farthest = Math.max(i + arr[i], farthest);

            if(i == currEnd){
                currEnd = farthest;
                jumps++;

                if(currEnd >= n-1) break;
            }
        }
        return jumps;
    }
}