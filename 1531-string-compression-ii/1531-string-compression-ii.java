// class Solution {

//     public int getLengthOfOptimalCompression(String s, int k) {
//         List<Integer> l = rle(s);
//         System.out.println(l);
//         if(k==0) return l.size();
//         return rleS(s).length()-k;
        
        
//     }

//     public List<Integer> rle(String s) {
//         List<Integer> l = new ArrayList<>();
//         char prev = s.charAt(0);
//         int count = 1;
//         for (int i = 1; i < s.length(); i++) {
//             char cur = s.charAt(i);
//             if (cur == prev) count++; 
//             else {
//                 l.add(count);
//                 prev = cur;
//                 count = 1;
//             }
//         }
//         l.add(count);
//         return l;
//     }
    
//     public String rleS(String s){
//         StringBuilder b = new StringBuilder();
//         char prev = s.charAt(0);
//         int count = 1;
//         for(int i=1;i<s.length();i++){
//             char cur =s.charAt(i);
//             if(cur==prev) count++;
//             else{
//                 b.append(prev);
//                 if(count>1) b.append(count);
//                 prev = cur;
//                 count = 1;
//             }
//         }
//         b.append(prev);
//         if(count>1) b.append(count);
//         return b.toString();
//     }
    
// }
class Solution {
  private Map<Integer, Integer> memo = new HashMap<>();
  Set<Integer> add = Set.of(1, 9, 99);
  public int getLengthOfOptimalCompression(String s, int k) {
    return dp(s, 0, (char) ('a' + 26), 0, k);
  }
 
          private int dp(String s, int idx, char lastChar, int lastCharCount, int k) {
    if (k < 0) {
      return Integer.MAX_VALUE / 2;
    }
    
    if (idx == s.length()) {
      return 0;
    }
    
    int key = idx * 101 * 27 * 101 + (lastChar - 'a') * 101 * 101 + lastCharCount * 101 + k;
    
    if (memo.containsKey(key)) {
      return memo.get(key);
    }
    
    int keepChar;
    int deleteChar = dp(s, idx + 1, lastChar, lastCharCount, k - 1);
    if (s.charAt(idx) == lastChar) {
      keepChar = dp(s, idx + 1, lastChar, lastCharCount + 1, k) + (add.contains(lastCharCount) ? 1 : 0);
    } else {
      keepChar = dp(s, idx + 1, s.charAt(idx), 1, k) + 1;
    }
    int res = Math.min(keepChar, deleteChar);
    memo.put(key, res);
    
    return res;
  }
}