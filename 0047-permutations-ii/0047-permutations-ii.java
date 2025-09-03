class Solution {
    List<List<Integer>> al;
    public List<List<Integer>> permuteUnique(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        al = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        helper(0, arr, hm, n);
        return al;
    }

    public void helper(int i, int[] arr, HashMap<Integer,Integer> hm, int n){
        if(i == n){
            List<Integer> temp = new ArrayList<>();
            for(int num : arr){
                temp.add(num);
            }
            al.add(temp);
            return;
        }

        hm.forEach((key, value) -> {
            if(value > 0){
                arr[i] = key;
                hm.put(key, value-1);

                helper(i+1, arr, hm, n);
                
                hm.put(key, value);
            }
        });
        return;
    }
}