class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0) {
                   rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int r:rows) repRow(matrix, r);
        for(int c:cols) repCol(matrix, c);
    }
    public void repRow(int[][] mat, int r){
        int n = mat[0].length;
        for(int i=0;i<n;i++){
            mat[r][i]=0;
        }
    }
    public void repCol(int[][] mat, int c){
        int n = mat.length;
        for(int i=0;i<n;i++){
            mat[i][c]=0;
        }
    }
}