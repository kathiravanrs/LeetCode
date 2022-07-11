class Solution {
    public String removeVowels(String s) {
        StringBuilder b = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(!(c=='a' || 
               c=='e' ||
              c=='i' ||
              c=='o'||
              c=='u')){
                b.append(c);
            }
        }
        return b.toString();
    }
}