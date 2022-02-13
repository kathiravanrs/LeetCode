class Solution {
    public int fib(int n) {
        if(n<2) return n;
        int prev1 = 0;
        int prev2 = 1;
        for(int i=1;i<n-1;i++){
            int temp = prev1 + prev2;
            prev1 = prev2;
            prev2 = temp;
        }
        return prev1+prev2;
    }
}