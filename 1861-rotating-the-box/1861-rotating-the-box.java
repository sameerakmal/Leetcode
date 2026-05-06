class Solution {
    public char[][] rotateTheBox(char[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0; i < m; i++){
            int empi = -1;
            int empj = -1;
            for(int j = n-1; j >= 0; j--){
                if(mat[i][j] == '*'){
                    empi = -1;
                    empj = -1;
                }
                else if(mat[i][j] == '#'){
                    if(empi != -1 && empj != -1){
                        mat[i][j] = '.';
                        mat[empi][empj] = '#';
                        j = empj;
                        empj = -1;
                        empi = -1;
                    }
                }
                if(mat[i][j] == '.'){
                    if(empi == -1 && empj == -1){
                        empi = i;
                        empj = j;
                    }
                }
            }
        }
        char[][] newMat = new char[n][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                newMat[j][m-1-i] = mat[i][j];
            }
        }
        return newMat;
    }
}