class Solution {
    public int singleNumber(int[] nums) {
        int val = 0;
        for(int a:nums){
            val ^=a;
        }
        return val;
    }
}