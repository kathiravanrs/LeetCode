class Solution {
    public int concatenatedBinary(int n) {
        int[] l = new int[n+1];
        l[1] = 1;
        for(int i=2;i<=n;i++){
            int mult =1+(int) (Math.log(i) / Math.log(2));
            int val = l[i-1];
            while(mult-->0) {
                val = val*2;
                val = val % 1000000007;
            }
            l[i] = val+i;
        }
        return l[n];
    }
}