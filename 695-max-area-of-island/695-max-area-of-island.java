class Solution {
    
    
    boolean[][] seen;
    int[][] g;
    int m;
    int n;
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        m = grid.length;
        n = grid[0].length;
        seen = new boolean[m][n];
        g = grid;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !seen[i][j]) {
                    max = Math.max(max, area(i, j));
                }
            }
        }

        return max;
    }
    
    public int area(int i, int j){
        seen[i][j] = true;
        if(g[i][j]==0) return 0;
        int a = 1;
        if(i<m-1 && !seen[i+1][j]) a+= area(i+1,j);
        if(j<n-1 && !seen[i][1+j]) a+= area(i,j+1);
        if(j>0 && !seen[i][j-1]) a+= area(i,j-1);
        if(i>0 && !seen[i-1][j]) a+= area(i-1,j);
        
        return a;
    }
}
