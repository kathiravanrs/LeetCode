class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int rl = matrix.length;
        int c = matrix[0].length;
        int[][] r = new int[c][rl];
        
        for(int i=0;i<c;i++){
            for(int j =0; j<rl;j++){
                r[i][j] = matrix[j][i];
            }
        }
        return r;
        
    }
}