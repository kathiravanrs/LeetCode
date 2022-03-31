class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = (r+l)/2;
            int v = nums[mid];
            if(v == target) return mid;
            else if(v > target){
                r = mid - 1;
            }
            else l = mid + 1;
        }
        
        return -1;
    }
}