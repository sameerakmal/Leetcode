class Solution {
    public int numberOfSpecialChars(String s) {
        HashSet<Character> upper = new HashSet<>();
        HashSet<Character> lower = new HashSet<>();

        for(char ch : s.toCharArray()){
            if(ch >= 97 && ch <= 123){
                lower.add(ch);
            }
            else{
                upper.add(ch);
            }
        }
        int cnt = 0;

        for(char ch : lower){
            if(upper.contains((char)(ch - 32))){
                cnt++;
            }
        }
        return cnt;
    }
}