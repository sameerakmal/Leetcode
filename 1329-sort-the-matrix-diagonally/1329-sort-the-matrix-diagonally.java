class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for(int j = 0; j < n; j++){
            sortDiagonal(mat, 0, j);
        }

        for(int i = 1; i < m; i++){
            sortDiagonal(mat, i, 0);
        }
        return mat;
    }

    private void sortDiagonal(int[][] mat, int row, int col){
        int m = mat.length;
        int n = mat[0].length;

        int i = row;
        int j = col;

        List<Integer> li = new ArrayList<>();

        while(i < m && j < n){
            li.add(mat[i][j]);
            i++;
            j++;
        }

        Collections.sort(li);

        i = row;
        j = col;
        int idx = 0;

        while(i < m && j < n){
            mat[i][j] = li.get(idx++);
            i++;
            j++;
        }
    }
}