class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for(char a: s.toCharArray()) count[a-'a']++;
        for(char a: t.toCharArray()) count[a-'a']--;
        
        for(int a:count){
            if(a!=0) return false;
        }
        return true;
    }
}