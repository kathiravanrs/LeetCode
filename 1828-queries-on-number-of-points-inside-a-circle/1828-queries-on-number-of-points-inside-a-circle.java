class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        
        for(int i=0;i<n;i++){
            for(int[] point:points){
                int distance = (point[0]-queries[i][0])*(point[0]-queries[i][0]) + 
                           (point[1]-queries[i][1])*(point[1]-queries[i][1]);
                if(distance<=queries[i][2]*queries[i][2]) ans[i]++;
            }
        }
        return ans;
    }
}