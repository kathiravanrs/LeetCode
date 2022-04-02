class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int a:nums){
            if(a==0) count++;
        }
        for(int j=0;j<count;j++){
            for(int i = 0; i<nums.length-1;i++){
                if(nums[i]==0){
                    nums[i] = nums[i+1];
                    nums[i+1] = 0;
                }
            }
        }
    }
}