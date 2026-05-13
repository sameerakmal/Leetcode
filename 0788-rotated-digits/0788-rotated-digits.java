class Solution {
    public int rotatedDigits(int n) {
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(isGood(i)){
                cnt++;
            }
        }
        return cnt;
    }
    public boolean isGood(int num){
        boolean changed = false;

        while(num > 0){
            int dig = num % 10;
            if(dig == 3 || dig == 4 || dig == 7) return false;

            if(dig == 2 || dig == 5 || dig == 6 || dig == 9){
                changed = true;
            }
            
            num /= 10;
        }

        return changed;
    }
}