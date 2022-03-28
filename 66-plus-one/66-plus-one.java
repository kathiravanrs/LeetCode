class Solution {

    public int[] plusOne(int[] digits) {
        // int n = digits.length;
        // int last = digits[n-1];
        // if(last == 9) {
        //     digits[n-1] = 0;
        //     digits[n-2] = digits[n-2]+1;
        // }
        // else        digits[n-1] = last + 1;
        // return digits;

        // int n = 0;
        // for(int a: digits){
        //     n = (n*10)+a;
        // }
        // System.out.println(n);
        // String a = String.valueOf(n+1);
        // int[] d = new int[a.length()];
        // int i = 0;
        // for(char c : a.toCharArray()){
        //     System.out.println(c);
        //     d[i] = Integer.valueOf(c-'0');
        //     i++;
        // }
        // return d;

        ArrayList<Integer> a = new ArrayList<>();
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int d = digits[i];
            if (carry == 1) {
                if (d == 9) {
                    d = 0;
                    carry = 1;
                } else {
                    d = d + carry;
                    carry = 0;
                }
            }
            a.add(0, d);
        }
        if (carry == 1) a.add(0, 1);
        int[] arr = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = a.get(i);
        }
        return arr;
    }
}
