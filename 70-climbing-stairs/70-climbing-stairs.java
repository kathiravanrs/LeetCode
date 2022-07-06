class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        for(int i = 0;i<=n;i++){
            if(i<3) arr[i] = i;
            else arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}