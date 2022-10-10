class Solution {

    public String breakPalindrome(String palindrome) {
        int l = palindrome.length();
        if (l == 1) return "";
        StringBuilder b = new StringBuilder();
        int pos = -1;
        for (int i = 0; i < l/2; i++) {
            if (palindrome.charAt(i) != 'a') {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            b.append(palindrome.substring(0, l - 1));
            b.append("b");
        } else {
            b.append(palindrome.substring(0, pos));
            b.append("a");
            b.append(palindrome.substring(pos + 1, l));
        }
        return b.toString();
    }
}
