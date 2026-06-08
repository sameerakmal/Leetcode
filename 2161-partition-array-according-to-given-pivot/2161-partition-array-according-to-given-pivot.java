class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
        int[] ans = new int[arr.length];
        int idx = 0;

        for (int x : arr)
            if (x < pivot) ans[idx++] = x;

        for (int x : arr)
            if (x == pivot) ans[idx++] = x;

        for (int x : arr)
            if (x > pivot) ans[idx++] = x;
        return ans;
    }
}