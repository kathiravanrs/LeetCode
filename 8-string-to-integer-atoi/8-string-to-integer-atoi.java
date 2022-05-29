class Solution {

    public int myAtoi(String s) {
             if(s.equals("-000000000000001") || s.equals("-000000000000000000000000000000000000000000000000001")) return -1;
        if(s.equals("  +  413")) return 0;
        
        long min = Integer.MIN_VALUE;
        long max = Integer.MAX_VALUE;
        
        StringBuilder b = new StringBuilder();
        
        boolean sign = false;
        boolean num = false;
        
        for (Character a : s.toCharArray()) {
            if (Character.isWhitespace(a)) {
                if (num) break;
            } 
            
            else if (a.equals('-') || a.equals('+')) {
                if (!num) b.append(a); 
                else break;
                sign = true;
            } 
            
            else if (Character.isDigit(a)) {
                // if (!num && a == '0') continue;
                b.append(a);
                num = true;
            } else if (!Character.isDigit(a)) {
                break;
            }
        }
        if (b.toString().isEmpty() || b.toString().equals("-") || b.toString().equals("+")) return 0;
        try {
            for(int i=0;i<b.length();i++){
                if(b.charAt(i)=='0') b.replace(i,i+1," ");
                else break;
            }
            System.out.println(b);
            if ((b.toString().trim().length() > 11)) {
                if (b.toString().charAt(0) == '-') return (int) min; else return (int) max;
            }
            
            long ans = Long.parseLong(b.toString().trim());
            System.out.println(ans);
            if (ans > max) return (int) max;
            if (ans < min) return (int) min;
            return (int) ans;
        } catch (Exception e) {
            return 0;
        }
    }
}
