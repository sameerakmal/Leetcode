class Solution {
    public int mirrorDistance(int n) {
        int num = n;
        int rev = 0;
        while(num > 0){
            int dig = num % 10;
            rev = rev * 10 + dig;
            num /= 10;
        }
        return Math.abs(n - rev);
    }
}