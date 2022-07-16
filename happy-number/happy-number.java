class Solution {
    
    public int sumSq(int n){
        int a = 0;
        while(n>0){
            a += (n%10)*(n%10);
            n /= 10;
        }
        return a;
    }
    
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(n!=1){
            if(s.contains(n)) return false;
            s.add(n);
            n = sumSq(n);

        }
        return true;
    }
}