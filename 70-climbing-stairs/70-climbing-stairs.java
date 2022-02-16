class Solution {
    public int climbStairs(int n) {
        int[] a = new int[n+1];
        for(int i=1; i<=n;i++){
            if(i<3) a[i] = i;
            else{
                a[i] = a[i-1]+a[i-2];
            }
        }
        return a[n];
    }
    
    
}