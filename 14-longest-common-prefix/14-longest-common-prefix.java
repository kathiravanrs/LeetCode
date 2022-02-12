class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        String first = strs[0];        
        for(int i = 0;i<first.length(); i++){
            boolean flag = true;
            try{
                for(int j=1;j<strs.length;j++){
                    if(strs[j].charAt(i)==first.charAt(i)) continue;
                    else flag = false;
                }
            }
            catch(Exception e){
                return ans;
            }
            if(flag) ans = ans+first.charAt(i);
            else break;
            
        }
        return ans;
    }
}
