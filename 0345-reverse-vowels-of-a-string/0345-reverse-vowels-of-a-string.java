class Solution {
    public boolean isVowel(char c){
        if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u' 
          ||c=='A' || c=='E'|| c=='I'|| c=='O'|| c=='U') return true;
        return false;
    }
    public String reverseVowels(String st) {
        StringBuilder s = new StringBuilder(st);
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            while(l<r&&!isVowel(s.charAt(l))) l++;
            while(r>l&&!isVowel(s.charAt(r))) r--;
            char left = s.charAt(l), right = s.charAt(r);
            if(l<r){
                s.setCharAt(l, right);
                s.setCharAt(r, left);
                l++;
                r--;
            }
        }
        return s.toString();
    }
}