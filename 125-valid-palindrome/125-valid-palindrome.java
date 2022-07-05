class Solution {
    public boolean isPalindrome(String s) {
        if(s.isBlank()) return true;
        String t = "";
        String r = "";
        String valid = "abcdefghijklmnopqrstuvwxyz0123456789";
        for(char a: s.toLowerCase().toCharArray()){
            if(valid.contains(String.valueOf(a))) t+=String.valueOf(a);
        }
        for(int i = t.length()-1;i>=0;i--){
            r += String.valueOf(t.charAt(i));
        }

        if(t.equals(r)) return true;
        else return false;
    }
}