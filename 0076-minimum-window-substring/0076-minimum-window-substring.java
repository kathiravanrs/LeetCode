class Solution {

    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        // if(t.length()==s.length()) return s.equals(t)?s:"";
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        String ans = s;
        boolean matched = false;

        for (char c : t.toCharArray()) tMap.put(c, tMap.getOrDefault(c, 0) + 1);

        int l = 0, r = 0;
        while (l < s.length()) {
            if (match(sMap, tMap)) {
                if ((r - l) <= ans.length()) {
                    matched = true;
                    ans = s.substring(l, r);
                }
                char c = s.charAt(l);
                sMap.put(c, sMap.get(c) - 1);
                l++;
            } 
            else if(r<s.length()) {
                char c = s.charAt(r);
                sMap.put(c, sMap.getOrDefault(c, 0) + 1);
                r++;
            }
            else return matched?ans:"";
        }
        return matched?ans:"";
    }

    public boolean match(Map<Character, Integer> sMap, Map<Character, Integer> tMap) {
        for (char c : tMap.keySet()) {
            if (!sMap.containsKey(c) || tMap.get(c) > sMap.get(c)) return false;
        }
        return true;
    }
}
