class Solution {
    public int minimumDistance(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        int minDist = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            hm.putIfAbsent(num, new ArrayList<>());
            hm.get(num).add(i);
        }
        for(ArrayList<Integer> li : hm.values()){
            int n = li.size();
            if(n < 3) continue;
            for(int l = 0; l < n-2; l++){
                int i = li.get(l);
                int j = li.get(l+1);
                int k = li.get(l+2);
                int dist = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                minDist = Math.min(minDist, dist);
            }
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}