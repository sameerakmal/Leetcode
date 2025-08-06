class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] basketUsed = new boolean[n];
        int notPlaced = 0;

        for (int fruit : fruits) {
            boolean isPlaced = false;
            for (int i = 0; i < n; i++) {
                if (!basketUsed[i] && baskets[i] >= fruit) {
                    basketUsed[i] = true;
                    isPlaced = true;
                    break;
                }
            }
            if (!isPlaced) notPlaced++;
        }

        return notPlaced;
    }
}