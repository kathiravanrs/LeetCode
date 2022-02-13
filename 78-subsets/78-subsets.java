class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        li.add(new ArrayList<>());
        for(int a:nums){
            List<List<Integer>> t = new ArrayList<>();
            for(List<Integer> l: li){
                List<Integer> ls = new ArrayList<>(l);

                ls.add(a);
                t.add(ls);                
            }
            li.addAll(t);
        }
        return li;
    }
}