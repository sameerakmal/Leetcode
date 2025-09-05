class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(helper(i, j, board, 0, word)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean helper(int i, int j, char[][] mat, int k, String s){
        if(k == s.length()) return true;
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] != s.charAt(k)) {
            return false;
        }
        char temp = mat[i][j];
        mat[i][j] = '/';
        boolean found = helper(i+1, j, mat, k+1, s) || 
                        helper(i, j+1, mat, k+1, s) || 
                        helper(i, j-1, mat, k+1, s) ||
                        helper(i-1, j, mat, k+1, s);
        mat[i][j] = temp;
        return found;
    }
}