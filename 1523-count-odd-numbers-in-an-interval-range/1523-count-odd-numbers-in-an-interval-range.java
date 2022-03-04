class Solution {
    public int countOdds(int low, int high) {
        int d =0;
        if (low%2 == 1 || high %2 ==1) d=1;
        return (high - low)/2 + d;
    }
}