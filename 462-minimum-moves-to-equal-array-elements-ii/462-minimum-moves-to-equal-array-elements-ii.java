class Solution {
    public int minMoves2(int[] nums) {
        // int sum = 0;
        // for(int a:nums){
        //     sum += a;
        // }
        // int avg = sum/nums.length;
        Arrays.sort(nums);
        int mean = nums.length%2!=0? nums[nums.length/2]: (nums[nums.length/2] + nums[nums.length/2 -1])/2;
        System.out.println(mean);
        int res = 0;
        for(int a:nums){
            res += Math.abs(mean-a);
        }
        return res;
    }
}