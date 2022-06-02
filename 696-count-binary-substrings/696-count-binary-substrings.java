class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        int z = 0;
        int o = 0;
        int prev = -1;
        for (int j = 0; j < s.length(); j++) {
            
            if (s.charAt(j) == '0') {
                if (prev == 1 && z > 0) z=0;
                z++;
                if(z<=o) count++;
                prev = 0;
            } 
            
            
            else {
                if (prev == 0 && o > 0) o=0;
                o++;
                                if(z>=o) count++;

                prev = 1;
            }
        }

        return count;
    }
}
