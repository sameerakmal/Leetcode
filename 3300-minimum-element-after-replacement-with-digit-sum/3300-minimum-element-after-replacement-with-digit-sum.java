class Solution {
    public int minElement(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int num = arr[i];
            int newN = 0;
            while(num > 0){
                newN += (num % 10);
                num /= 10;
            }
            min = Math.min(min, newN);
        }
        return min;
    }
}