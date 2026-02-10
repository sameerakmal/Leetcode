class Solution {
    public int longestBalanced(int[] arr) {
        int n = arr.length;
        int max = 0;
        for(int i = 0; i < n; i++){
            HashSet<Integer> odd = new HashSet<>();
            HashSet<Integer> even = new HashSet<>();
            
            for(int j = i; j < n; j++){
                if(arr[j] % 2 == 0){
                    even.add(arr[j]);
                }
                else{
                    odd.add(arr[j]);
                }
                
                if(even.size() == odd.size()){
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
}