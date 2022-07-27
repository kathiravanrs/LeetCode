class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        
        int l=0,i=0;
        for(char a: boxes.toCharArray()){
            left[i] = l;
            if(a=='1') l++;
            i++;
        }
        for(i=0;i<n;i++){
            if(boxes.charAt(i)=='1') l--;
            right[i] = l;
        }
        
        for(i=0;i<n;i++)
            if(boxes.charAt(i)=='1') ans[0]+=i;
        
        for(i=1;i<n;i++){
            ans[i] = ans[i-1] - right[i] + left[i];
            if(boxes.charAt(i)=='1') ans[i]--;
        }
        return ans;
    }
}