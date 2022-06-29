class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
        
        int res = 0;
        boolean odd = false;
        for(int v:map.values()){
            if(v%2==0) res+=v;
            else{
                if(!odd) res++;
                res +=v;
                res--;
                odd = true;
            }
        }
        
        return res;
    }
}