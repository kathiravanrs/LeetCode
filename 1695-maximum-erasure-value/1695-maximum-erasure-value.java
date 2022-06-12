class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int score = 0;
        int l=0;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for(int r=0;r<nums.length;r++){
            int n = nums[r];
            if(set.add(n)){
                sum += n;
            }
            else{
                score = Math.max(score, sum);
                while(nums[l]!=nums[r]){
                    sum -= nums[l];
                    set.remove(nums[l]);
                    l++;
                }
                l++;
                
            }
        }
        return Math.max(score, sum);
    }
}