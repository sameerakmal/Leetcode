class Solution {
    List<List<Integer>> al;
    public List<List<Integer>> permute(int[] arr) {
        al = new ArrayList<>();
        helper(0, arr, arr.length);
        return al;
    }
    public void helper(int i, int[] arr, int n){
        if(i == n-1){
            List<Integer> temp = new ArrayList<>();
            for (int num : arr) {
                temp.add(num);
            }
            al.add(temp);
            return;
        }
        for(int j = i; j < n; j++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            helper(i + 1, arr, n);
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
        }
        return;
    }
}
