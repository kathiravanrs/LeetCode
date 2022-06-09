class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length>0){
            int i = 1;    
            int prev = nums[0];
            for(int j=1;j<nums.length;j++){       
                if(nums[j]!=prev){
                    prev=nums[j];
                    nums[i]=nums[j];
                    i++;
                }
            }
            return i;
        }
        return 0;
    }
}