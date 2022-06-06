class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new TreeSet<>();
        
        for(int a: arr1){
            set1.add(a);
        }
        for(int b:arr2){
            if(set1.contains(b)) set2.add(b);
        }
        for(int c:arr3){
            if(set2.contains(c)) set3.add(c);
        }
        return new ArrayList<>(set3);
    }
}