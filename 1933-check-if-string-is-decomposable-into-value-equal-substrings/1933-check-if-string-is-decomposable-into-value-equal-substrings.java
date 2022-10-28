class Solution {
    public boolean isDecomposable(String s) {
        int n = s.length();
        if(n<2) return false;
        boolean two = false;
        int count=1;
        for(int i=1;i<=n;i++){
            if(i<n && s.charAt(i)==s.charAt(i-1)) count++;
            else{
                if(count%3==1) {
return false;
                }
                else if(count%3==2){
                    if(two) return false;
                    two = true;
                }
                count =1 ;
            }
        }
        return two;
    }
}