class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] ans = new int[n+1];
        
        int l = 0, r=n, i=0;
        for(char a: s.toCharArray()){
            if(a=='I') ans[i] = l++;
            if(a=='D') ans[i] = r--;
            i++;
        }
        ans[i] = r;
        return ans;
    }
}