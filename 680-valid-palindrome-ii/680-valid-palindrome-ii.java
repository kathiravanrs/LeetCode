class Solution {
    public boolean validPalindrome(String s) {
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return check(s,i+1,s.length()-1-i) || check(s,i,s.length()-2-i);
            }
        }
        return true;
    }
    public boolean check(String s, int a, int b){
        while(a<b){
            if(s.charAt(a) == s.charAt(b)){
                a++; b--;
            }
            else return false;
        }
        return true;
    }
}