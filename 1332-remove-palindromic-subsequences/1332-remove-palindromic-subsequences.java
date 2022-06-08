class Solution {
    public int removePalindromeSub(String s) {
        if(s.length()==0) return 0;
        if(isPal(s)) return 1;
        return 2;
    }
    public boolean isPal(String s){
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
}