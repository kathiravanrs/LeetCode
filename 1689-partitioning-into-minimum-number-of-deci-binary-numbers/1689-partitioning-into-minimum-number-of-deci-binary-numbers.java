class Solution {
    public int minPartitions(String n) {
        if(n.contains("9"))return 9;
        else if(n.contains("8")) return 8;
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