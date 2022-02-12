class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        if(r==0){
            if(nums[0]==target) return 0;
            else return target>nums[0]?1:0;
        }
        return search(l, r, nums, target);
        
        
    }
    public int search(int l, int r, int[] a, int k){
        if(r-l == 1){
            if(a[l]==k) return l;
            else if(a[r]==k) return r;
            else return k>a[l]? (k>a[r]?r+1:r):l;
        }
        int mid = (l+r)/2;
        if(k == a[mid]) return mid;
        else if(k>a[mid]) return search(mid, r, a, k);
        else return search(l, mid, a, k);
    }
}