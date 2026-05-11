class Solution {
    public int[] separateDigits(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : arr){
            String s = String.valueOf(num);

            for(int i = 0; i < s.length(); i++){
                ans.add(s.charAt(i) - '0');
            }
        }
        int[] al = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            al[i] = ans.get(i);
        }
        return al;
    }
}