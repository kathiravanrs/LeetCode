class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<2) return nums.length;
        int max =0;
        Arrays.sort(nums);
        int temp = 1;
        for(int i=1;i<nums.length;i++){
            int diff = nums[i]-nums[i-1];
            if(diff==1) temp++;
            else if(diff==0) continue;
            else {
                max = Math.max(max, temp);
                temp =1;
            }
        }
        return Math.max(max, temp);
    }
    
}