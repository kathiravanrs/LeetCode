class Solution {
    public List<Integer> goodDaysToRobBank(int[] s, int time) {
        int n = s.length;
        int[] pre = new int[n];
        int[] post = new int[n];
        for(int i=1; i<n;i++){
            if(s[i]<=s[i-1]) pre[i] = pre[i-1]+1;
        }
        for(int i=n-2; i>=0;i--){
            if(s[i]<=s[i+1]) post[i] = post[i+1]+1;
        }

        
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(pre[i]>=time && post[i]>=time) ans.add(i);
        }
        return ans;
    }
}