class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        for(String word : words){
            if(row1(word)||row2(word)||row3(word)) res.add(word);
        }
        return res.toArray(new String[res.size()]);
    }
    public boolean row1(String s){
        String row = "qwertyuiop";
        for(char c: s.toLowerCase().toCharArray()){
            if(!row.contains(String.valueOf(c))) return false;
        }
        return true;
    }
    
    public boolean row2(String s){
        String row = "asdfghjkl";
        for(char c: s.toLowerCase().toCharArray()){
            if(!row.contains(String.valueOf(c))) return false;
        }
        return true;
    }
    
    public boolean row3(String s){
        String row = "zxcvbnm";
        for(char c: s.toLowerCase().toCharArray()){
            if(!row.contains(String.valueOf(c))) return false;
        }
        return true;
    }
}