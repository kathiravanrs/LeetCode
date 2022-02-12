class Solution {
    public boolean isValid(String s) {
        
        char[] a = s.toCharArray();
        Stack<Character> b = new Stack<>();
        for(char c : a){
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
        if(!b.isEmpty()) return false;
        return true;
    }
}