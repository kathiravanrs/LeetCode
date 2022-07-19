public class Solution {
    public int[] countBits(int n) {

        int[] ans = new int[n + 1];
        for (int x = 0; x <= n; x++) {
            ans[x] = Integer.bitCount(x);
        }
        return ans;
    }
}