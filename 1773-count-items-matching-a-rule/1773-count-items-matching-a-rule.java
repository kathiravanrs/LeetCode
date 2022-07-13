class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int pos = 0;
        if(ruleKey.equals("color")) pos=1;
        else if(ruleKey.equals("name")) pos=2;
        
        for(List<String> item:items){
            if(item.get(pos).equals(ruleValue)) count++;
        }
        return count;
    }
}