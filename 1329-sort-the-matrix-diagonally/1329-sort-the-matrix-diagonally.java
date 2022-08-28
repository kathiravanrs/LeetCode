class Solution {

    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            int j = i;
            int k = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            while (j < m && k < n) {
                pq.add(mat[j][k]);
                j++;
                k++;
            }
            j = i;
            k = 0;
            while (j < m && k < n) {
                mat[j][k] = pq.poll();
                j++;
                k++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            int j = 0;
            int k = i;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            while (j < m && k < n) {
                pq.add(mat[j][k]);
                j++;
                k++;
            }
            j = 0;
            k = i;
            while (j < m && k < n) {
                mat[j][k] = pq.poll();
                j++;
                k++;
            }
        }
        
        
        return mat;
    }
}
