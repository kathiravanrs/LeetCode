class Solution {

    public boolean canJump(int[] nums) {
        int len = nums.length;
        boolean[] res = new boolean[len];

        res[len - 1] = true;
        for (int i = len - 2; i >= 0; i--) {
            for(int j=1;j<=nums[i];j++){
                if(i+j<len && res[i+j]==true){
                    res[i]=true;
                    continue;
                }
            }
        }
        return res[0];
    }
}
