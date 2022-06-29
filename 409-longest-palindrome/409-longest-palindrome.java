class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }        
        int res = 0;
        boolean odd = false;
        for(int v:map.values()){
            res+=v;
            if(v%2!=0)
            {
                if(!odd) res++;
                res--;
                odd = true;
            }
        }
        
        return res;
    }
}