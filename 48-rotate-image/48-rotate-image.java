class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m/2;i++){
            int[] temp = matrix[i];
            matrix[i] = matrix[m-i-1];
            matrix[m-1-i] = temp;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}