class SparseVector {
    int[] cur;
    SparseVector(int[] nums) {
        cur = nums;
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int prod = 0;
        int[] two = vec.cur;
        for(int i = 0;i<vec.cur.length;i++){
            prod += two[i]*cur[i];
        }
        return prod;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);