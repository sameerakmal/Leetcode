class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : friends){
            hs.add(i);
        }
        int[] ans = new int[friends.length];
        int cnt = 0;
        for(int i : order){
            if(hs.contains(i)){
                ans[cnt] = i;
                cnt++;
            }
        }
        return ans;
    }
}