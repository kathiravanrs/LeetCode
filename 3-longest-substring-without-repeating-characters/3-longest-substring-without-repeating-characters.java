class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            Set<Character> set = new HashSet<>();
            int temp = 0;
            for(int j=i;j<arr.length;j++){
                if(set.contains(arr[j])) break;
                else{
                    set.add(arr[j]);
                    temp++;
                }
            }
            if(temp>max) max=temp;
            
        }
        return max;
        
    }
}

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s.length()<2) return s.length();
//         char[] arr = s.toCharArray();
//         int max = 0;
//         int left = 0;
//         int right = 0;
        
//         while(right<arr.length && left<arr.length){
//             if(check(arr, left, right)){
//                 max = Math.max(max, right-left+1);
//                 right++;
//             }
//             else{
//                 left++;
//             }
//         }
        
        
//         return max;
        
//     }
//     public boolean check(char[] arr, int l, int r){
//         Set<Character> set = new HashSet<>();
//             for(int j=l;j<=r;j++){
//                 if(set.contains(arr[j])) return false;
//                 else{
//                     set.add(arr[j]);
//                 }
//             }
//         return true;
//     }
// }