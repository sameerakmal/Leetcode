class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            int idx = queries[i];
            int val = nums[idx];

            ArrayList<Integer> list = map.get(val);

            if (list.size() == 1) {
                ans.add(-1);
                continue;
            }

            int pos = findIndex(list, idx);

            int size = list.size();

            int prev = list.get((pos - 1 + size) % size);
            int next = list.get((pos + 1) % size);

            int d1 = Math.abs(idx - prev);
            int d2 = Math.abs(idx - next);

            d1 = Math.min(d1, n - d1);
            d2 = Math.min(d2, n - d2);

            ans.add(Math.min(d1, d2));
        }

        return ans;
    }

    private int findIndex(ArrayList<Integer> list, int target) {
        int l = 0, h = list.size() - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (list.get(mid) == target) {
                return mid;
            } else if (list.get(mid) < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return -1;
    }
}