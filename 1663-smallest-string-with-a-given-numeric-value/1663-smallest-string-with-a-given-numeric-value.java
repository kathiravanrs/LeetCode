class Solution {

    public String getSmallestString(int n, int k) {
        StringBuilder b = new StringBuilder();
        char[] a = new char[n];
        for (int i = 0; i < n; i++) {
            a[i] = 'a';
        }
        k = k-n;
        for (int i = n - 1; i >= 0; i--) {
            if (k <= 25) {
                a[i] = (char)('a' + (k));
                k = 0;
                
            } else {
                a[i] = 'a' + 25;
                k -= 25;
            }
        }
        for(char c : a){
            b.append(c);
        }
        return b.toString();
    }
}
