class Solution {
    public int titleToNumber(String columnTitle) {
        
        char[] arr = columnTitle.toCharArray();
        int pos = 0;
        int ans = 0;
        for(int i= arr.length-1;i>=0;i--){
            ans += Math.pow(26, pos) * val(arr[i]);
            pos++;
        }
        return ans;
    }
    
    
    public int val(char c){
        return c - 'A'+1;
    }
}