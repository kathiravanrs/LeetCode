class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int total = 0;
        int cur = 0;
        
        for(char a: abbr.toCharArray()){
            if(Character.isAlphabetic(a)) {
                total += cur;
                if(total>=word.length()||word.charAt(total)!=a) return false;
                total++;
                cur = 0;
            }
            
            if(Character.isDigit(a)){
                if((cur == 0)&& (a=='0')) return false;
                cur = cur*10 + Integer.parseInt(String.valueOf(a));
            }
        }
        return (total + cur)==word.length();    
    }
    
}