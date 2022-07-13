class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] left = new int[n];
        int[] top = new int[n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                left[i] = Math.max(left[i], grid[i][j]);
                top[j] = Math.max(top[j], grid[i][j]);
            }
        }
        int count = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int cap = Math.min(left[i],top[j]);
                if(grid[i][j]<cap) count += cap - grid[i][j];
            }
        }
        return count;
    }
}