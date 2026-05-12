class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

        int ans = 0;
        int curr = 0;
        
        for(int[] task : tasks){
            int act = task[0];
            int min = task[1];

            if(curr < min){
                ans += (min - curr);
                curr = min;
            }

            curr -= act;
        }
        return ans;
    }
}