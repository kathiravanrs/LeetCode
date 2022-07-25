class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length;
        int n = mat[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        while(!q.isEmpty()){
            int[] cur = q.remove();
            int i=cur[0];
            int j=cur[1];
            if(mat[i][j]==target) return true;
            if(i<m-1 && !visited[i+1][j] && mat[i+1][j]<=target) {
                q.add(new int[]{i+1,j});
                visited[i+1][j] = true;
            }
            if(j<n-1 && !visited[i][j+1] && mat[i][j+1]<=target) {
                q.add(new int[]{i,j+1});
                visited[i][j+1] = true;
            }
        }
        return false;
    }
}