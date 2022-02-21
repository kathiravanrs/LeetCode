class Solution {
//     public int majorityElement(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int a:nums){
//             map.put(a,map.getOrDefault(a,0)+1);
//         }
//         System.out.println(map);
//         for(Map.Entry<Integer, Integer> m: map.entrySet()){
    
//             if(m.getValue() > nums.length/2) return m.getKey();
//         }
//         return 0;
//     }
    public int majorityElement(int[] nums) {
        int c=0;
        int t=0;
        for(int a:nums){
            if(t==0) c=a;
            if(a==c) t++;
            else t--;
        }
        return c;
    }
}