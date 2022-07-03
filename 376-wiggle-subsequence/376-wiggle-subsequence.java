class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2) return 1;
        if(nums.length==2) return nums[0]!=nums[1]?2:1;
        
        
        int prevDiff = nums[1]-nums[0];
        int ans = prevDiff!=0?2:1;

        for(int i=2;i<nums.length;i++){
            int diff = nums[i] - nums[i-1];
            if((prevDiff>=0 && diff<0)||(prevDiff<=0&&diff>0)){
                ans++;
                prevDiff = diff;
            }
        }

        return ans;
    }
}