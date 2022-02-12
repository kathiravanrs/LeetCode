class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m+n-1;
        m--;n--;
        while((n>=0)&&(m>=0)){
            int l = nums1[m];
            int r = nums2[n];
            
            if(l>=r){
                nums1[x]=l;
                m--;
            }
            else{
                nums1[x]=r;
                n--;
            }
            x--;
        }
        while(n>=0){
                            nums1[x]=nums2[n];
            x--;
            n--;

        }
    }
}