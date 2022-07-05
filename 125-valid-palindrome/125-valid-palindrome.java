class Solution {
    public boolean isPalindrome(String s) {
        if(s.isBlank()) return true;
        String t = "";
        String valid = "abcdefghijklmnopqrstuvwxyz0123456789";
        for(char a: s.toLowerCase().toCharArray()){
            if(valid.contains(String.valueOf(a))) t+=String.valueOf(a);
        }
        for(int i = 0;i<t.length()/2;i++){
           if(t.charAt(i)!=t.charAt(t.length()-1-i)) return false;
        }

        return true;
    }
}