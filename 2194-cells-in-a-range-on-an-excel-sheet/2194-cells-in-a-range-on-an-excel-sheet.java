class Solution {
    public List<String> cellsInRange(String s) {
        char row1 = s.charAt(0);
        int col1 = Integer.valueOf(s.charAt(1)-'0');
        char row2 = s.charAt(3);
        int col2 = Integer.valueOf(s.charAt(4)-'0');
        List<String> ans = new ArrayList<>();
        for(char c=row1;c<=row2;c++){
            for(int i=col1;i<=col2;i++){
                
                ans.add(c+""+i);
            }
        }
        return ans;
    }
}