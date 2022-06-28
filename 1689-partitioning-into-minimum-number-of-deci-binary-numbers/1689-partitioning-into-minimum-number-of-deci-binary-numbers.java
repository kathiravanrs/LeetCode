class Solution {
    public int minPartitions(String n) {
        int res = 0;
        for(char c: n.toCharArray()){
            int cur = c - '0';
            if(cur == 9) return 9;
            if (cur>res){
                res = cur;
            }
        }
        return res;
    }
}