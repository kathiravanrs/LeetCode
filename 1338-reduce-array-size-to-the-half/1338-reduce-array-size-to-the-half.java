class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a:arr) map.put(a, map.getOrDefault(a, 0)+1);
        int[][] array = new int[map.size()][2];
        int i=0;
        for(int a:map.keySet()){
            array[i] = new int[]{a, map.get(a)};
            i++;
        }
        
        Arrays.sort(array, new Comparator<int[]>(){
           public int compare(int[] a, int[] b){
               return Integer.compare(b[1],a[1]);
           } 
        });
        int n = arr.length;
        int count = 0;
        int ans = 0;
        for(int[] a:array){
            count += a[1];
            ans ++;
            if(count*2>=n) return ans;
        }
        return 0;
    }
}