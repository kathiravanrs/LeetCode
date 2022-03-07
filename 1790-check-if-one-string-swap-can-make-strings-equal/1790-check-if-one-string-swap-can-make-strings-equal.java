class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)) continue;
            else l.add(i);
        }
        if(l.size() == 0) return true;
        if(l.size()==2){
            if(s1.charAt(l.get(0))==s2.charAt(l.get(1))){
                if(s2.charAt(l.get(0))==s1.charAt(l.get(1))) return true;
            } 
        }
        return false;
    }
}