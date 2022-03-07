class Solution {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int i = 0;
        int res = -1;
        int r = Integer.MAX_VALUE;
        for (int[] a : points) {
            int d;
            if (a[0] == x) {
                d = Math.abs(a[1] - y);
                if (d < r) {
                    res = i;
                    r = d;
                }
            } else if (a[1] == y) {
                d = Math.abs(a[0] - x);
                if (d < r) {
                    res = i;
                    r = d;
                }
            }
            i++;
        }
        return res;
    }
}
