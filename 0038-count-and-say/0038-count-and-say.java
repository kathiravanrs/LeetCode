class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for(int i=0;i<n-1;i++){
            StringBuilder b = new StringBuilder();
            char prev = res.charAt(0);
            int count = 1;
            for(int j=1;j<res.length();j++){
                if(res.charAt(j)==prev) count++;
                else{
                    b.append(count);
                    b.append(prev);
                    prev = res.charAt(j);
                    count = 1;
                }
            }
            b.append(count);
            b.append(prev);
            res = b.toString();
        }
        return res;

    }
}