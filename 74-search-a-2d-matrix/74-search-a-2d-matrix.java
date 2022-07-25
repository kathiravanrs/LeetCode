class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0,j=0;
        if(matrix[i][j]==target || 
           (i<m-1 && matrix[i+1][j]==target) || 
           (j<n-1 && matrix[i][j+1]==target) ) return true;
        while(i<m-1 && matrix[i+1][j]<target) i++;
        if(matrix[i][j]==target || 
           (i<m-1 && matrix[i+1][j]==target) || 
           (j<n-1 && matrix[i][j+1]==target) ) return true;
        while(j<n-1 && matrix[i][j+1]< target) j++;
        if(matrix[i][j]==target || 
           (i<m-1 && matrix[i+1][j]==target) || 
           (j<n-1 && matrix[i][j+1]==target) ) return true;
        return false;
    }
}