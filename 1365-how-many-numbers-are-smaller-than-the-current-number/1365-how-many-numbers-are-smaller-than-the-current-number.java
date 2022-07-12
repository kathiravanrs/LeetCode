class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if((i!=j) && nums[i]>nums[j]) count++;
            }
            ans[i] = count;
        }
        
        return ans;
    }
}