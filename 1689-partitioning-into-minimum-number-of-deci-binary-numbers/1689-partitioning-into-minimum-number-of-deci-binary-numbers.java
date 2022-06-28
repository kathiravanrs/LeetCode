class Solution {
    public int minPartitions(String n) {
        int res = 0;
        for(int i =0; i<n.length();i++){
            int cur = n.charAt(i) - '0';
            if(cur == 9) return 9;
            if (cur>res){
                res = cur;
            }
        }
        return res;
    }
}