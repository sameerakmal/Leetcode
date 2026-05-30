class Solution {
    public int numberOfSpecialChars(String s) {
        int[] arrSm = new int[26];
        int[] arrCp = new int[26];

        Arrays.fill(arrSm, -1);
        Arrays.fill(arrCp, -1);

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                arrSm[ch - 'a'] = i;
            }
            else{
                if(arrCp[ch - 'A'] == -1){
                    arrCp[ch - 'A'] = i;
                }
            }
        }
        int count = 0;

        for(int i = 0; i < 26; i++){
            if(arrSm[i] != -1 &&
            arrCp[i] != -1 &&
            arrSm[i] < arrCp[i]){
                count++;
            }
        }

        return count;
    }
}