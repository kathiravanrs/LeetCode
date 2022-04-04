class Solution {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> set = new HashMap<>();
        String res = "";
        int n = Integer.MAX_VALUE;
        for (char c : licensePlate.toLowerCase().toCharArray()) {
            if("abcdefghijklmnopqrstuvwxyz".contains(String.valueOf(c)))    set.put(c, set.getOrDefault(c, 0) + 1);
        }
        for(String word: words){
            Map<Character, Integer> map = new HashMap<>();
            for (char c : word.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            if(check(set, map)){
                if(word.length()<n) {
                    res = word;
                    n = word.length();       
                                    }
            }
        }
        return res;
    }
    
    public boolean check(Map<Character, Integer> a, Map<Character, Integer> b){
        for(Map.Entry<Character, Integer> e: a.entrySet()){
            if(!b.containsKey(e.getKey()) || b.get(e.getKey())<e.getValue()) return false;
        }
        return true;
    }
}
