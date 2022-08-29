class Solution {
    
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islands= 0;
        boolean[][] visited = new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    islands++;
                    visit(i, j, m, n, grid, visited);
                }
            }
        }
        return islands;
        
    }
    public void visit(int i, int j, int m, int n, char[][] g, boolean[][] visited){
        if(visited[i][j]) return;
        visited[i][j] = true;
        if(i<m-1 && g[i+1][j]=='1') visit(i+1, j, m, n, g, visited);
        if(j<n-1 && g[i][j+1]=='1') visit(i, j+1, m, n,g, visited);
        if(i>0 && g[i-1][j]=='1') visit(i-1, j, m, n,g, visited);
        if(j>0 && g[i][j-1]=='1') visit(i, j-1, m, n,g, visited);
    }
}