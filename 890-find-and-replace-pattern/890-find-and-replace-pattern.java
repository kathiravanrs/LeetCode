class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> l = new ArrayList<>();
        String p = pat(pattern);
        for(String word:words){
            if(p.equals(pat(word))) l.add(word);
        }
        return l;
    }
    
    
    public String pat(String in){
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<in.length();i++){
            char c = in.charAt(i);
            if(!map.containsKey(c)) map.put(c, i);
            sb.append(map.get(c));
        }
        return sb.toString();
    }
}