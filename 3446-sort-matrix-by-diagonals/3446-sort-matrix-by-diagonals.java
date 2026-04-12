class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for(int i = 0; i < n; i++){
            sortGrid(grid, i, 0);
        }
        for(int i = 1; i < n; i++){
            sortGrid(grid, 0, i);
        }
        return grid;
    }
    private void sortGrid(int[][] grid, int row, int col){
        int i = row;
        int j = col;
        int n = grid.length;
        ArrayList<Integer> arr = new ArrayList<>();

        while(i < n && j < n){
            arr.add(grid[i++][j++]);
        }
        if(row < col){
            Collections.sort(arr);
        }
        else{
            Collections.sort(arr, Collections.reverseOrder());
        }
        int idx = 0;
        i = row;
        j = col;
        while(i < n && j < n){
            grid[i++][j++] = arr.get(idx++);
        }
        return;
    }
}