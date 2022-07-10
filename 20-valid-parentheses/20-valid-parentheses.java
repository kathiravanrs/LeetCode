class Solution {
    public boolean isValid(String s) {
        Stack<Character> b = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                b.push(c);
            }
            else{
                if(b.isEmpty()) return false;
                char v = b.peek();
                if(c==')'){
                    if(v!='(') return false;
                    else b.pop();
                }
                else if(c=='}'){
                    if(v!='{') return false;
                    else b.pop();
                }
                else if(c==']'){
                    if(v!='[') return false;
                    else b.pop();

                }
            }
        }
        return (b.isEmpty());
    }
}