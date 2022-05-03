class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> tt = new Stack<>();
        
        for(char a: s.toCharArray()){
            if(a=='#'){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(a);
        }
        for(char a: t.toCharArray()){
            if(a=='#'){
                if(!tt.isEmpty()) tt.pop();
            }
            else tt.push(a);
        }
        return st.equals(tt);
    }
}