class Solution {
    public int evalRPN(String[] tokens) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for(String s: tokens){
            if(s.equals("+")){
                int l = st.pop();
                int f = st.pop();
                ans = f+l;
                st.add(ans);
            }
            else if(s.equals("-")){
                int l = st.pop();
                int f = st.pop();
                ans = f-l;
                st.add(ans);
            }
            else if(s.equals("/")){
                int l = st.pop();
                int f = st.pop();
                ans = f/l;
                st.add(ans);
            }
            else if(s.equals("*")){
                int l = st.pop();
                int f = st.pop();
                ans = f*l;
                st.add(ans);
            }
            else st.add(Integer.valueOf(s));
        }
        return st.pop();
    }
}