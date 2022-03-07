class Solution {
    public int arraySign(int[] nums) {
        int val = 1;
        for(int a: nums){
            if(a==0) return 0;
            if(a<1) val *= -1;
        }
        return val;
    }
}