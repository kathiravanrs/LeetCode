class Solution {
    public boolean isPalindrome(String s) {
        if(s.isBlank()) return true;
        s = s.toLowerCase();

        StringBuilder ti = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))) ti.append(s.charAt(i));
        }
        // StringBuilder it = ti.;
        return ti.toString().equals(ti.reverse().toString());
    }
}