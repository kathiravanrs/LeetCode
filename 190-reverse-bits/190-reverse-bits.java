public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(n));
        sb.reverse();
        while(sb.length()<32) sb.append('0');
        System.out.println(sb);

        return Integer.parseUnsignedInt(sb.toString(), 2);
    }
}