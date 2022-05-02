class Solution {
    public int tribonacci(int n) {
        

        int[] t = {0,1,1,0};
        if(n<3) return t[n];
        for(int i = 0; i<n-2; i++){
            t[3] = t[0]+t[1]+t[2];
            t[0] =t[1];
            t[1]=t[2];
            t[2]=t[3];
        }
        return t[3];
    }
}