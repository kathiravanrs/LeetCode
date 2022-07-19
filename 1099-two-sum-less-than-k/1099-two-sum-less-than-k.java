class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int n = -1;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i]>k) continue;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]>k) continue;
                if(nums[i]+nums[j]>n && nums[i]+nums[j]<k ) n = nums[i]+nums[j];
            }
        }
        return n;
    }
}

// class Solution {

//     public int twoSumLessThanK(int[] nums, int k) {
//         Arrays.sort(nums);
        
//         int n = -1;
//         int i = 0;
//         int j = nums.length - 1;
//         while (i < j) {
//             if (nums[i] + nums[j] < k) {
//                 n = Math.max(n,nums[i] + nums[j]);
//                 i++;
//             } else j--;
//         }
//         return n;
//     }
// }
