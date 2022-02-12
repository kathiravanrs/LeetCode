class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1 = -1;
        int index2 = -1;
        for(int i=0; i<nums.length-1;i++){
            index1 = i;
            for(int j=i+1; j<nums.length;j++){
                index2 = j;
                if(nums[index1]+nums[index2]==target) {
                    return new int[]{index1,index2};    
                }
            }
        }
        return new int[]{-1,-1};
    }
}