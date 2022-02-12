class Solution {
    public int romanToInt(String li) {
        char[] s = li.toCharArray();
        int len = s.length;
        int val = 0;
        char prev = 'a';
        for(int i=0; i<len;i++){
            if(s[i]=='I') {
                val += 1;
                prev = s[i];
            }
            else if(s[i]=='V') {
                if(prev == 'I') val += 3;
                else val += 5;
                prev = s[i];
            }
            else if(s[i]=='X') {
                if(prev == 'I') val += 8;
                else val += 10;
                prev = s[i];
            }
            else if(s[i]=='L') {
                if(prev == 'X') val += 30;
                else val += 50;
                prev = s[i];
            }
            else if(s[i]=='C') {
                if(prev == 'X') val += 80;
                else val += 100;
                prev = s[i];
            }
            else if(s[i]=='D') {
                if(prev == 'C') val += 300;
                else val += 500;
                prev = s[i];
            }
            else if(s[i]=='M') {
                if(prev == 'C') val += 800;
                else val += 1000;
                prev = s[i];
            }
            
        }
        return val;
    }
}