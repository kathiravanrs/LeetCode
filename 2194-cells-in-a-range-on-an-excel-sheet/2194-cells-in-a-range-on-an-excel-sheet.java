class Solution {
    public List<String> cellsInRange(String s) {
        char row1 = s.charAt(0);
        char col1 = s.charAt(1);
        char row2 = s.charAt(3);
        char col2 = s.charAt(4);
        List<String> ans = new ArrayList<>();
        for(char c=row1;c<=row2;c++){
            for(char i=col1;i<=col2;i++){
                ans.add(c+""+i);
            }
        }
        return ans;
    }
}