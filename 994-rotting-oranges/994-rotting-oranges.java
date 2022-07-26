class Solution {
    public int orangesRotting(int[][] grid) {
        int time = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        while(true){
            time++;
            
            int[][] copy = new int[m][n];
            for(int i=0;i<m;i++) copy[i] = grid[i].clone();
            boolean changed = false;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==2){
                        if(i<m-1 && copy[i+1][j]==1){
                            copy[i+1][j]=2;
                            changed = true;
                        }
                        if(j<n-1 && copy[i][j+1]==1){
                            copy[i][j+1]=2;
                            changed = true;
                        }
                        if(i>0 && copy[i-1][j]==1){
                            copy[i-1][j]=2;
                            changed = true;
                        }
                        if(j>0 && copy[i][j-1]==1){
                            copy[i][j-1]=2;
                            changed = true;
                        }
                    }
                }
            }
            if(!changed) break;
            grid = new int[m][n];
            for(int i=0;i<m;i++) grid[i] = copy[i].clone();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return time-1;
    }
}