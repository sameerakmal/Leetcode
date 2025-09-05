class Solution {
    List<List<Integer>> al;
    public List<List<Integer>> subsets(int[] arr) {
        al = new ArrayList<>();
        helper(0, arr, new ArrayList<>(), arr.length);
        return al;
    }
    public void helper(int i, int[] arr, List<Integer> temp, int n){
        al.add(new ArrayList<>(temp));
        for(int j = i; j < n; j++){
            temp.add(arr[j]);
            helper(j + 1, arr, temp, n);
            temp.remove(temp.size()-1);
        }
        return;
    }
}