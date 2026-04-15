class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int minDist = Integer.MAX_VALUE;
        int n = words.length;
        int dist = 0;
        for(int i = 0; i < n; i++){
            if(target.equals(words[(startIndex + i) % n])){
                minDist = Math.min(dist, minDist);
            }
            dist++;
        }
        dist = 0;
        for(int i = 0; i < n; i++){
            if(target.equals(words[(startIndex - i + n) % n])){
                minDist = Math.min(dist, minDist);
            }
            dist++;
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}